package com.woniu.it.练习题;




import java.util.ArrayList;
import java.util.List;
class Annualmeeting implements Runnable{
	/*
	 * 2、某公司组织年会,会议入场时有两个入口,在入场时每位员工都能获取一张双色球彩票,假设公司有100个员工,利用多线程模拟年会入场过程,
	并分别统计每个入口入场的人数,以及每个员工拿到的彩票的号码。线程运行后打印格式如下：
	编号为: 2 的员工 从后门 入场! 拿到的双色球彩票号码是: [17, 24, 29, 30, 31, 32, 07]
	编号为: 1 的员工 从后门 入场! 拿到的双色球彩票号码是: [06, 11, 14, 22, 29, 32, 15]
	//.....
	从后门入场的员工总共: 13 位员工
	从前门入场的员工总共: 87 位员工*/
	private int personNumber=100;//员工总数量
	private  int BackDoorCount=0;//统计从前面进入的员工的数量
	private  int FrontDoorCount=0;//统计从后面进入的员工的数量
	List<String> list=new ArrayList<String>();//记录双色球的数字
	List<Integer> number=new ArrayList<Integer>();//记录入场的员工的数量
	private Object lock=new Object();//同步锁中的对象监视器
	//红色球数组
	String[] Redarr= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17",
			"18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33"};
	//蓝色球数组
	String[] Bluearr= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16"};
	@Override
	public void run() {

		while(true) {

			list.clear();//每循环一次，清空集合的号码，也可以把 上面的List<String> list=new ArrayList<String>();放在这里
			try {
				Thread.sleep(10);//线程休眠一段时间，可以让两个线程抢着执行的更加均匀一点 
			}catch(Exception e){

			}
			//对共享数据加上同步锁  ，一次只能一个进程进来
			synchronized(lock) {
				if(personNumber>0) {//如果还有员工没进完
					int num=(int)(Math.random()*100+1);//员工是随机进入的，1-100号的员工
					if(number.contains(num)) {//如果该员工已经进入，则continue
						continue;
					}else {
						number.add(num);//把新的员工加入集合中
					}
					for (int i = 0; i < 6; ) {//产生6个红色球号码
						int j=(int)(Math.random()*33);//随机产生0-32的数字
						if(list.contains(Redarr[j])) {//如果集合中已经包含该数字，则continue，以下同理
							continue;
						}else {
							list.add(Redarr[j]);
							i++;
						}
					}
					for (int i = 0; i < 1; ) {//产生1个蓝色球号码
						int j=(int)(Math.random()*16);
						if(list.contains(Bluearr[j])) {
							continue;
						}else {
							list.add(Bluearr[j]);
							i++;
						}
					}
					if(Thread.currentThread().getName().equals("前门")) {//统计从哪个门进入
						BackDoorCount++;
					}else {
						FrontDoorCount++;
					}
					System.out.println("编号为: "+num+"的员工 从"+Thread.currentThread().getName()+"入场！ 拿到的双色球彩票号码是:"+list);
					personNumber--; //上面代码执行一次，证明是一个人已经进入会场了，故personNumber--

				}else {
					//else的内容，也要进行线程判断，最后加上break语句，不然前后门线程会多执行一次的
					if(Thread.currentThread().getName().equals("前门")) {
						System.out.println("从前门入场的员工总共:"+FrontDoorCount);
						break;
					}

					if(Thread.currentThread().getName().equals("后门")) {
						System.out.println("从后门入场的员工总共:"+BackDoorCount);
						break;
					}
				}
			}
		}
	}	
	
}
public class AnnualmeetingTest {
	public static void main(String[] args) {
		Annualmeeting an=new Annualmeeting();
	    Thread BackDoor=new Thread(an,"后门");	//前门线程
	    Thread FrontDoor=new Thread(an,"前门");//后门线程
	    BackDoor.start();//启动后门线程
	    FrontDoor.start();//启动前门线程
	    
	}
}
