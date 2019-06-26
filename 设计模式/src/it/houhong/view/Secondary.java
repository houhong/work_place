package it.houhong.view;
import it.houhong.dao.Record;
import it.houhong.model.User;

import java.util.Scanner;
/**
 * @author Administrator
 * 二级界面类
 */
public class Secondary {
//	static String[] operation = new String[20];
	
	
	//查询余额
	public void balanceInquiry() {
		int index = MainUI.index;
		User your = MainUI.user[index];
		String op = your.getName() + "====查询余额====" + your.getMoney();
		System.out.println("您的余额为:" + your.getMoney());
		for(int i = 0;i < Record.operation.length;i++) {
			if(null == Record.operation[i]) {
				Record.operation[i] = op;
				break;
			}else {
				System.out.println("操作过多无法添加！");
				break;
			}
		}
		new Select().subUI();
	}
	//取款
	public void drawMoney() {
		Scanner sc = new Scanner(System.in);
		int index = MainUI.index;
		User your = MainUI.user[index];
		int currenrtMoney=your.getMoney();
		System.out.println("请输入取款金额：");
		int money = sc.nextInt();
		if(money <= your.getMoney()) {
			your.setMoney( currenrtMoney-money);
			System.out.println("取款成功，余额为：" + your.getMoney());
		}else {
			System.out.println("有多少钱没点B数？");
			drawMoney();
		}
		
		String op = your.getName() + "====取款====" + your.getMoney();
		for(int i = 0;i < Record.operation.length;i++) {
			if(null == Record.operation[i]) {
				Record.operation[i] = op;
				break;
			}else {
				System.out.println("操作过多无法添加！");
				break;
			}
		}
		new Select().subUI();
	}
		//存款
		public void deposit() {
			Scanner sc = new Scanner(System.in);
			int index = MainUI.index;
			User your = MainUI.user[index];
			System.out.println("请输入存款金额：");
			int money = sc.nextInt();
			your.setMoney(your.getMoney() + money);
			System.out.println("存款成功，余额为：" + your.getMoney());
			
			String op = your.getName() + "====存款====" + your.getMoney();
			for(int i = 0;i < Record.operation.length;i++) {
				System.out.println(Record.operation[i]);
				
				if( Record.operation[i] == null) {
					Record.operation[i] = op;
					break;
				}else {
					System.out.println("操作过多无法添加！");
					break;
				}
			}
			new Select().subUI();
		}
	//转账
	public void transfer() {
		Scanner sc = new Scanner(System.in);
		int index = MainUI.index;
		User your = MainUI.user[index];
		System.out.println("请输入对方账户：");
		String name = sc.next();
		//检查对方用户是否存在
		int index_01 = new MainUI().findUser(name);
		
		if(index_01 != -1) {
			System.out.println("请输入转账金额：");
			int money = sc.nextInt();
			if(money < your.getMoney()) {
				User get = MainUI.user[index_01];
				your.setMoney(your.getMoney() - money);
				get.setMoney(get.getMoney() + money);
				System.out.println("存款成功，余额为：" + your.getMoney());
			}else {
				System.out.println("有多少钱没B数？");
				transfer();
			}
		}else {
			System.out.println("对方用户不存在！");
			transfer();
		}
		
		String op = your.getName() + "====存款====" + your.getMoney();
		for(int i = 0;i < Record.operation.length;i++) {
			if(null == Record.operation[i]) {
				Record.operation[i] = op;
				break;
			}else {
				System.out.println("操作过多无法添加！");
				break;
			}
		}
		new Select().subUI();
	}
	//查询流水
	public void log() {
		for(String op : Record.operation) {
			if(op != null) {
				System.out.println(op);
			}
		}
		new Select().subUI();
	}
	//管理员冻结用户账户
	public void freeze() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要冻结的用户名：");
		String name = sc.next();
		//检测用户是否存在
		int index = new MainUI().findUser(name);
		if(index != -1) {
			User user = MainUI.user[index];
			user.setFrozen(2);
		}else {
			System.out.println("用户不存在！");
			freeze();
		}
		new Select().adSubUI();
	}
}
