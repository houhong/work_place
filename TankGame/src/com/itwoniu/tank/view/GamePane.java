package com.itwoniu.tank.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.rmi.server.Operation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import org.junit.Test;

import com.itwoniu.tank.contents.Constants;
import com.itwoniu.tank.contents.Constants.PANLE;
import com.itwoniu.tank.contents.Constants.WIN;
import com.itwoniu.tank.model.BackImage;
import com.itwoniu.tank.model.ElemtyTank;
import com.itwoniu.tank.model.HeroTank;
import com.itwoniu.tank.model.Shell;

/**
 * @author layker  --这是一个画图类
 *
 */
public class GamePane extends JPanel{


	public BackImage backImage ;
	public HeroTank  heroTank;
	public Shell     shell;

	//线程安全的集合copyOnWrieArrayList
	public CopyOnWriteArrayList<Shell> shellList;
	public CopyOnWriteArrayList<Shell> elemtyShells;
	public CopyOnWriteArrayList<ElemtyTank>  elemtyTanks;

	//用来装删除的集合
	public ArrayList<Shell>  needDeleteSell;

	public ArrayList<ElemtyTank>  needDeleteElemTank;






	public GamePane() {




		//存储坦克的数量->初始化
		/*for (int i = 0; i <emlemyNum(); i++) {

			elemtyTanks.add(new ElemtyTank() );

		}*/

		//存储坦克的数量->初始化
		/*new Thread(new Runnable() {

			@Override
			public void run() {

				elemtyTanks = new CopyOnWriteArrayList<>();

				for (int i = 0; i < emlemyNum(); i++) {

					elemtyTanks.add(new ElemtyTank());

				}
			}
		}).start();*/

		elemtyTanks = new CopyOnWriteArrayList<>();

		for (int i = 0; i < emlemyNum(); i++) {

			elemtyTanks.add(new ElemtyTank());

		}
		System.out.println("当前敌方坦克的数量"+elemtyTanks.size());

		//测试
		//elemtyTanks.add(new ElemtyTank());

		//存储子弹
		shellList = new CopyOnWriteArrayList<>();

		elemtyShells = new CopyOnWriteArrayList<>();

		//设置画板大小
		this.setBounds(0, 0, PANLE.HIGH,PANLE.WIDTH);
		//设置背景颜色
		this.setBackground(Color.GREEN);
		//初始化背景图片
		backImage = new BackImage();
		//初始化英雄图片
		heroTank  = new HeroTank();

		//定时器
		Timer timer = new Timer();

		timer.schedule(new TimerTask() {

			@Override
			public void run() {

				for (ElemtyTank elemtyTank : elemtyTanks) {

					int count = 2;//每个敌方坦克只能发射100颗子弹
					elemtyTank.swap();

					//elemtyTank.move(elemtyTank.tankDir);

					//没有子弹
					/*while(count>0){	
						//敌方坦克的子弹
						Shell elemtyShell  = new Shell(elemtyTank.tankDir, elemtyTank.x+elemtyTank.TANK_LENGTH, elemtyTank.y);

						elemtyShells.add(elemtyShell);
						//elemtyShell.move();

						count--;

					}*/



					//shell.move();


				}

			}
		}, 0, 1000);

		timer.schedule(new TimerTask() {
			@Override
			public void run() {

				heroTank.swap();

				for (Shell shell : shellList) {

					shell.move();			
				}

				//敌方坦克子弹
				for (Shell  elemtyShell: elemtyShells) {

					elemtyShell.move();
				}

				//消灭坦克
				DeleteTank();
				//刷新
				repaint();

			}
		}, 0,500);

		/*
		 * 设置一个定时器：让一个坦克动
		 */

		//线程池 --单个线程池
		ExecutorService nste = Executors.newSingleThreadExecutor();

		//缓存性线程池
		ExecutorService nService = Executors.newCachedThreadPool();

		//固定一个数量固定的线程池
		ExecutorService fixedSerice = Executors.newFixedThreadPool(elemtyTanks.size()+1);



		for (ElemtyTank elemtyTank  :elemtyTanks) {



			nste.execute(new Runnable() {

				@Override
				public void run() {

					String[] operation = new String[]{"w","d","s","a"};
					Random random = new Random();

					String order = operation[random.nextInt(operation.length)];

					if("wasd".contains(order)){

						while (true) {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

							elemtyTank.move(order);
							System.out.println(elemtyTank.isShit);
							if (elemtyTank.isShit == true) {

								break;
							}
						}
					}

				}
			});


		}

		/*nste.execute(new Runnable() {

			@Override
			public void run() {

				while (true) {

					String[] operation = new String[]{"w","s","d","a","delete","start"};
					Random random = new Random();

					String   order = operation[random.nextInt(6)];

					for (ElemtyTank elemtyTank :elemtyTanks) {

						if ("start".equals(order)) {


						} else if("wasd".contains(order)){
							elemtyTank.move(order);

						}else if(condition){


						}
						elemtyTank.move(order);
					}

				}

			}
		});*/

		//添加键盘键入器
		this.addKeyListener(new KeyAdapter() {

			@Override //观察者模式
			public void keyPressed(KeyEvent e) {

				String keyDir = String.valueOf(e.getKeyChar());

				if("wasd".contains(keyDir)){

					heroTank.move(keyDir);
				}

				if("j".contains(keyDir)){

					//创造一个子弹
					shell =new Shell(heroTank.tankDir, heroTank.x+heroTank.TANK_LENGTH, heroTank.y);          
					shellList.add(shell);
				}
			}

		});

		//聚焦
		this.setFocusable(true);



	}


	//产生坦克的数量
	public int emlemyNum(){

		Random random = new Random();
		return 	random.nextInt(20);

	}





	@Override
	public void paint(Graphics g) {
		// TODO 自动生成的方法存根

		//BufferedImage read = ImageIO.read(new File("images/Win/backImg.png"));
		//BufferedImage read1 = ImageIO.read(new File("images/Star/star1.png"));
		g.drawImage(backImage.image, 0, 0, WIN.HIGH,WIN.WIDTH,null);

		g.drawImage(heroTank.getFirst(), heroTank.x, heroTank.y,heroTank.TANK_LENGTH,heroTank.TANK_WIDTH,null);
		printShell(g);

		printElemy(g);
		printElemyShell(g);


	}



	/*
	 * 判断是否删除敌方坦克
	 */
	public void  DeleteTank(){

		//遍历主人公发射的子弹 -- 再遍历每一个制造出来的敌方坦克
		//暂停
		for (Shell shell : shellList) {

			Iterator<ElemtyTank> iterator = elemtyTanks.iterator();

			while (iterator.hasNext()) {

				ElemtyTank elemtyTank = (ElemtyTank) iterator.next();

				if (issame(shell, elemtyTank)) {

					shell.isBoom = true;

					elemtyTank.isShit =true;
					elemtyTanks.remove(elemtyTank);

				} 
				//System.out.println("当前的敌方坦克的是否被击中"+elemtyTank.isShit);
			}

		}

	}



	//判断当前的坐标和子弹的坐标是否相同
	public boolean issame(Shell shell,ElemtyTank elemtyTank){

		boolean isSame = false;

		//判断是不是在同一条线上
		if(Math.abs(shell.x - elemtyTank.x)<=10){
			if ( (Math.abs(shell.y -elemtyTank.y)<=30)) {
				isSame = true;
			} else {
				isSame = false;
			}
		}

		if (Math.abs(shell.y - elemtyTank.y)<=10) {
			if ( (Math.abs(shell.x -elemtyTank.x)<=30)) {
				isSame = true;
			} else {
				isSame = false;
			}
		}


		return  isSame;

	}

	public void  printShell(Graphics g){




		Iterator<Shell> iterator = shellList.iterator();

		while (iterator.hasNext()) {

			Shell shell = (Shell) iterator.next();

			if (!shell.isBoom) {
				g.drawImage(shell.image, shell.x, shell.y, null);
			} else {

				for (int i = 0; i < shell.boomImage.size(); i++) {

					g.drawImage(shell.boomImage.get(i), shell.x, shell.y, null);
					shell.boomImage.remove(i);

				}	

				shellList.remove(shell);



			}
		}



	}


	public void printElemyShell(Graphics g){

		for (Shell elemtyShell : elemtyShells) {

			if(!elemtyShell.isBoom){
				g.drawImage(elemtyShell.image, elemtyShell.x, elemtyShell.y, null);
			}else{

				for (int i = 0; i < elemtyShell.boomImage.size(); i++) {
					g.drawImage(elemtyShell.boomImage.get(i), elemtyShell.x, elemtyShell.y,null);
				}
			}


		}

	}

	public void printElemy(Graphics g){

		for (ElemtyTank elemtyTank : elemtyTanks) {

			g.drawImage(elemtyTank.getFirst(), elemtyTank.x, elemtyTank.y, null);
		}
	}
}











