package it.houhong.view;
import java.util.Scanner;
/**
 * @author Administrator
 * 主界面
 */
public class Select {
	MainUI m = new MainUI();
	Secondary s = new Secondary();
	//登录 注册 退出
	public void mainUI() {
		Scanner sca = new Scanner(System.in);
		System.out.println("=========欢迎使用蜗牛ATM=========");
		System.out.println("==请选择选项: 1.登录 2.注册 3.退出==");
		int operation = sca.nextInt();
		switch(operation) {
		case 1:
			//登录
			this.m.login();
			break;
		case 2:
			//注册
			m.enroll();
			break;
		case 3:
			//退出
			System.exit(0);
			break;
		default :
			System.out.println("输入有误,请重新输入!");
			mainUI();
			break;
		}
	}
	//用户二级界面（取钱 存钱 转账 查询余额 查询流水 返回）
	public void subUI() {
		Scanner sca = new Scanner(System.in);
		System.out.println("==请选择选项: 1.查询余额 2.取款 3.存款 4.转账 5.查询流水 6.返回主界面==");
		int operation = sca.nextInt();
		switch(operation) {
		case 1:
			//查询余额
			this.s.balanceInquiry();
			break;
		case 2:
			//取款
			this.s.drawMoney();
			break;
		case 3:
			//存款
			this.s.deposit();
			break;
		case 4:
			//转账
			this.s.transfer();
			break;
		case 5:
			//查询流水
			this.s.log();
			break;
		case 6:
			//返回主界面
			this.mainUI();
			break;
		default :
			System.out.println("输入有误,请重新输入!");
			this.subUI();
			break;
		}
	}
	//管理员二级界面（冻结用户）
	public void adSubUI() {
		Scanner sca = new Scanner(System.in);
		System.out.println("==请输入选项：1.冻结用户 2.返回==");
		int operation = sca.nextInt();
		switch(operation) {
		case 1:
			//冻结用户账户
			s.freeze();
			break;
		case 2:
			//返回一级界面
			mainUI();
			break;
		default :
			System.out.println("输入有误！");
			adSubUI();
			break;
		}
	}
}
