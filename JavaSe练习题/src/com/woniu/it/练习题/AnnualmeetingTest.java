package com.woniu.it.��ϰ��;




import java.util.ArrayList;
import java.util.List;
class Annualmeeting implements Runnable{
	/*
	 * 2��ĳ��˾��֯���,�����볡ʱ���������,���볡ʱÿλԱ�����ܻ�ȡһ��˫ɫ���Ʊ,���蹫˾��100��Ա��,���ö��߳�ģ������볡����,
	���ֱ�ͳ��ÿ������볡������,�Լ�ÿ��Ա���õ��Ĳ�Ʊ�ĺ��롣�߳����к��ӡ��ʽ���£�
	���Ϊ: 2 ��Ա�� �Ӻ��� �볡! �õ���˫ɫ���Ʊ������: [17, 24, 29, 30, 31, 32, 07]
	���Ϊ: 1 ��Ա�� �Ӻ��� �볡! �õ���˫ɫ���Ʊ������: [06, 11, 14, 22, 29, 32, 15]
	//.....
	�Ӻ����볡��Ա���ܹ�: 13 λԱ��
	��ǰ���볡��Ա���ܹ�: 87 λԱ��*/
	private int personNumber=100;//Ա��������
	private  int BackDoorCount=0;//ͳ�ƴ�ǰ������Ա��������
	private  int FrontDoorCount=0;//ͳ�ƴӺ�������Ա��������
	List<String> list=new ArrayList<String>();//��¼˫ɫ�������
	List<Integer> number=new ArrayList<Integer>();//��¼�볡��Ա��������
	private Object lock=new Object();//ͬ�����еĶ��������
	//��ɫ������
	String[] Redarr= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17",
			"18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33"};
	//��ɫ������
	String[] Bluearr= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16"};
	@Override
	public void run() {

		while(true) {

			list.clear();//ÿѭ��һ�Σ���ռ��ϵĺ��룬Ҳ���԰� �����List<String> list=new ArrayList<String>();��������
			try {
				Thread.sleep(10);//�߳�����һ��ʱ�䣬�����������߳�����ִ�еĸ��Ӿ���һ�� 
			}catch(Exception e){

			}
			//�Թ������ݼ���ͬ����  ��һ��ֻ��һ�����̽���
			synchronized(lock) {
				if(personNumber>0) {//�������Ա��û����
					int num=(int)(Math.random()*100+1);//Ա�����������ģ�1-100�ŵ�Ա��
					if(number.contains(num)) {//�����Ա���Ѿ����룬��continue
						continue;
					}else {
						number.add(num);//���µ�Ա�����뼯����
					}
					for (int i = 0; i < 6; ) {//����6����ɫ�����
						int j=(int)(Math.random()*33);//�������0-32������
						if(list.contains(Redarr[j])) {//����������Ѿ����������֣���continue������ͬ��
							continue;
						}else {
							list.add(Redarr[j]);
							i++;
						}
					}
					for (int i = 0; i < 1; ) {//����1����ɫ�����
						int j=(int)(Math.random()*16);
						if(list.contains(Bluearr[j])) {
							continue;
						}else {
							list.add(Bluearr[j]);
							i++;
						}
					}
					if(Thread.currentThread().getName().equals("ǰ��")) {//ͳ�ƴ��ĸ��Ž���
						BackDoorCount++;
					}else {
						FrontDoorCount++;
					}
					System.out.println("���Ϊ: "+num+"��Ա�� ��"+Thread.currentThread().getName()+"�볡�� �õ���˫ɫ���Ʊ������:"+list);
					personNumber--; //�������ִ��һ�Σ�֤����һ�����Ѿ�����᳡�ˣ���personNumber--

				}else {
					//else�����ݣ�ҲҪ�����߳��жϣ�������break��䣬��Ȼǰ�����̻߳��ִ��һ�ε�
					if(Thread.currentThread().getName().equals("ǰ��")) {
						System.out.println("��ǰ���볡��Ա���ܹ�:"+FrontDoorCount);
						break;
					}

					if(Thread.currentThread().getName().equals("����")) {
						System.out.println("�Ӻ����볡��Ա���ܹ�:"+BackDoorCount);
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
	    Thread BackDoor=new Thread(an,"����");	//ǰ���߳�
	    Thread FrontDoor=new Thread(an,"ǰ��");//�����߳�
	    BackDoor.start();//���������߳�
	    FrontDoor.start();//����ǰ���߳�
	    
	}
}
