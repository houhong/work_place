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
 * 画笔类
 */

public class GamePanle extends JPanel{

	public BackImage backImage;

	public HeroTank heroTank;
	
	public ElemeyTank elemeyTank;
	
	public List<ElemeyTank> elemeyTanks;

	public GamePanle() {

		//1：设置画板的大小
		this.setBounds(0, 0, 600, 600);

		//设置背景颜色
		//this.setBackground(Color.green);

		//设置背景图片
		backImage = new BackImage();
		//初始化坦克
		heroTank =   new HeroTank();
		elemeyTanks = new ArrayList<>();
		
		for (int i = 0; i < elemNum(); i++) {
			
			   	elemeyTanks.add(new ElemeyTank());
			
		}
		

		//定时器：
		Timer timer = new Timer();

		timer.schedule(new TimerTask() {

			@Override
			public void run() {

				heroTank.swap();
				for (ElemeyTank elemeyTank : elemeyTanks) {
					elemeyTank.swap();
					elemeyTank.move(elemeyTank.tankDir);
				}
				


				//刷新
				repaint();

			}
		}, 0,1000);

		//Observer模式
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
		
		//swing的聚焦
		this.setFocusable(true);
		

	}

	//画笔
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
	
	//坦克数量
    public int elemNum(){
    	
    	Random random = new Random();
    	
    	return  random.nextInt(20);
    }




}
