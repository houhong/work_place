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
 * @author layker  --����һ����ͼ��
 *
 */
public class GamePane extends JPanel{


	public BackImage backImage ;
	public HeroTank  heroTank;
	public Shell     shell;

	//�̰߳�ȫ�ļ���copyOnWrieArrayList
	public CopyOnWriteArrayList<Shell> shellList;
	public CopyOnWriteArrayList<Shell> elemtyShells;
	public CopyOnWriteArrayList<ElemtyTank>  elemtyTanks;

	//����װɾ���ļ���
	public ArrayList<Shell>  needDeleteSell;

	public ArrayList<ElemtyTank>  needDeleteElemTank;






	public GamePane() {




		//�洢̹�˵�����->��ʼ��
		/*for (int i = 0; i <emlemyNum(); i++) {

			elemtyTanks.add(new ElemtyTank() );

		}*/

		//�洢̹�˵�����->��ʼ��
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
		System.out.println("��ǰ�з�̹�˵�����"+elemtyTanks.size());

		//����
		//elemtyTanks.add(new ElemtyTank());

		//�洢�ӵ�
		shellList = new CopyOnWriteArrayList<>();

		elemtyShells = new CopyOnWriteArrayList<>();

		//���û����С
		this.setBounds(0, 0, PANLE.HIGH,PANLE.WIDTH);
		//���ñ�����ɫ
		this.setBackground(Color.GREEN);
		//��ʼ������ͼƬ
		backImage = new BackImage();
		//��ʼ��Ӣ��ͼƬ
		heroTank  = new HeroTank();

		//��ʱ��
		Timer timer = new Timer();

		timer.schedule(new TimerTask() {

			@Override
			public void run() {

				for (ElemtyTank elemtyTank : elemtyTanks) {

					int count = 2;//ÿ���з�̹��ֻ�ܷ���100���ӵ�
					elemtyTank.swap();

					//elemtyTank.move(elemtyTank.tankDir);

					//û���ӵ�
					/*while(count>0){	
						//�з�̹�˵��ӵ�
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

				//�з�̹���ӵ�
				for (Shell  elemtyShell: elemtyShells) {

					elemtyShell.move();
				}

				//����̹��
				DeleteTank();
				//ˢ��
				repaint();

			}
		}, 0,500);

		/*
		 * ����һ����ʱ������һ��̹�˶�
		 */

		//�̳߳� --�����̳߳�
		ExecutorService nste = Executors.newSingleThreadExecutor();

		//�������̳߳�
		ExecutorService nService = Executors.newCachedThreadPool();

		//�̶�һ�������̶����̳߳�
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

		//��Ӽ��̼�����
		this.addKeyListener(new KeyAdapter() {

			@Override //�۲���ģʽ
			public void keyPressed(KeyEvent e) {

				String keyDir = String.valueOf(e.getKeyChar());

				if("wasd".contains(keyDir)){

					heroTank.move(keyDir);
				}

				if("j".contains(keyDir)){

					//����һ���ӵ�
					shell =new Shell(heroTank.tankDir, heroTank.x+heroTank.TANK_LENGTH, heroTank.y);          
					shellList.add(shell);
				}
			}

		});

		//�۽�
		this.setFocusable(true);



	}


	//����̹�˵�����
	public int emlemyNum(){

		Random random = new Random();
		return 	random.nextInt(20);

	}





	@Override
	public void paint(Graphics g) {
		// TODO �Զ����ɵķ������

		//BufferedImage read = ImageIO.read(new File("images/Win/backImg.png"));
		//BufferedImage read1 = ImageIO.read(new File("images/Star/star1.png"));
		g.drawImage(backImage.image, 0, 0, WIN.HIGH,WIN.WIDTH,null);

		g.drawImage(heroTank.getFirst(), heroTank.x, heroTank.y,heroTank.TANK_LENGTH,heroTank.TANK_WIDTH,null);
		printShell(g);

		printElemy(g);
		printElemyShell(g);


	}



	/*
	 * �ж��Ƿ�ɾ���з�̹��
	 */
	public void  DeleteTank(){

		//�������˹�������ӵ� -- �ٱ���ÿһ����������ĵз�̹��
		//��ͣ
		for (Shell shell : shellList) {

			Iterator<ElemtyTank> iterator = elemtyTanks.iterator();

			while (iterator.hasNext()) {

				ElemtyTank elemtyTank = (ElemtyTank) iterator.next();

				if (issame(shell, elemtyTank)) {

					shell.isBoom = true;

					elemtyTank.isShit =true;
					elemtyTanks.remove(elemtyTank);

				} 
				//System.out.println("��ǰ�ĵз�̹�˵��Ƿ񱻻���"+elemtyTank.isShit);
			}

		}

	}



	//�жϵ�ǰ��������ӵ��������Ƿ���ͬ
	public boolean issame(Shell shell,ElemtyTank elemtyTank){

		boolean isSame = false;

		//�ж��ǲ�����ͬһ������
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











