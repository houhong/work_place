package com.it.houhong.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import com.it.houhong.constens.Constants;
import com.it.houhong.constens.Constants.TANK;
import com.it.houhong.constens.Constants.WIN;
import com.it.houhong.model.BackImage;
import com.it.houhong.model.ElemeyTank;
import com.it.houhong.model.HeroTank;
/*
 * ������
 */

public class GamePanle extends JPanel{

	public BackImage backImage;

	public HeroTank heroTank;
	
	public ElemeyTank elemeyTank;
	
	public List<ElemeyTank> elemeyTanks;

	public GamePanle() {

		//1�����û���Ĵ�С
		this.setBounds(0, 0, 600, 600);

		//���ñ�����ɫ
		//this.setBackground(Color.green);

		//���ñ���ͼƬ
		backImage = new BackImage();
		//��ʼ��̹��
		heroTank =   new HeroTank();
		elemeyTanks = new ArrayList<>();
		
		for (int i = 0; i < elemNum(); i++) {
			
			   	elemeyTanks.add(new ElemeyTank());
			
		}
		

		//��ʱ����
		Timer timer = new Timer();

		timer.schedule(new TimerTask() {

			@Override
			public void run() {

				heroTank.swap();
				for (ElemeyTank elemeyTank : elemeyTanks) {
					elemeyTank.swap();
					elemeyTank.move(elemeyTank.tankDir);
				}
				


				//ˢ��
				repaint();

			}
		}, 0,1000);

		//Observerģʽ
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

				String dir = String.valueOf(e.getKeyChar());

				if ("wasd".contains(dir)) {
					//heroTank.dir(dir);
					//System.out.println(dir);
					heroTank.move(dir);
				}
			}
		});
		
		//swing�ľ۽�
		this.setFocusable(true);
		

	}

	//����
	@Override
	public void paint(Graphics g) {


		g.drawImage(this.backImage.image, 0, 0, null);
		paintTank(g);
		paintElemyTank(g);

	}

	public void paintTank(Graphics g){

		g.drawImage(heroTank.getFirst(), heroTank.x, heroTank.y, TANK.LENGTH,TANK.WIDTH,null);
	}
	
	
	public void paintElemyTank(Graphics g){
		
		for (ElemeyTank elemeyTank : elemeyTanks) {
			
			g.drawImage(elemeyTank.getFirst(), elemeyTank.x, elemeyTank.y, TANK.LENGTH,TANK.WIDTH,null);
		}
		
	}
	
	//̹������
    public int elemNum(){
    	
    	Random random = new Random();
    	
    	return  random.nextInt(20);
    }




}
