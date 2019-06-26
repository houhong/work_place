package com.itwoniu.tank.model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.imageio.ImageIO;

import com.itwoniu.tank.contents.Constants;
import com.itwoniu.tank.contents.Constants.HEROTANK;
import com.itwoniu.tank.contents.Constants.PANLE;


/*
 * 子弹类
 */

public class Shell {


	//爆炸图片
	//线程安全的集合
	public CopyOnWriteArrayList<BufferedImage> boomImage;
	
	//需要删除的子弹集合
	public ArrayList<Shell> deleteShell;

	//子弹的样子
	public BufferedImage image;

	public String dir;
	//子弹的坐标
	public int x;
	public int y;

	//子弹的大小
	public int length;
	public int width;

	//子弹的移动速度   ---默认为16
	public int step =15;


	public boolean isBoom ;






	public Shell(String dir,int x,int y) {
		
		//设置子弹大小
		this.length = Constants.SHELL.SHELL_LENGTH;
		this.width  = Constants.SHELL.SHELL_WIDTH;
		//判断子弹是否爆炸
		this.isBoom = false;
		boomImage = new CopyOnWriteArrayList<>();

		//放置爆炸图片
		try {
			boomImage.add(ImageIO.read(new File(Constants.SHELL.BOOM1)));
			boomImage.add(ImageIO.read(new File(Constants.SHELL.BOOM2)));
			boomImage.add(ImageIO.read(new File(Constants.SHELL.BOOM3)));
			boomImage.add(ImageIO.read(new File(Constants.SHELL.BOOM4)));
			boomImage.add(ImageIO.read(new File(Constants.SHELL.BOOM5)));
			boomImage.add(ImageIO.read(new File(Constants.SHELL.BOOM6)));
			boomImage.add(ImageIO.read(new File(Constants.SHELL.BOOM7)));
			boomImage.add(ImageIO.read(new File(Constants.SHELL.BOOM8)));
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}


		this.dir = dir;

		switch (dir) {
		case "w":
			try {
				image =ImageIO.read(new File(Constants.SHELL.SHELLW));
				this.x   = x-32;
				this.y   = y-32;
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
			break;
		case "a":
			try {
				image =ImageIO.read(new File(Constants.SHELL.SHELLA));
				this.x   = x -64;
				this.y   = y  ;
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
			break;

		case "s":
			try {
				image =ImageIO.read(new File(Constants.SHELL.SHELLS));
				this.x   = x-32;
				this.y   = y+32;
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
			break;

		case "d":
			try {

				this.x   = x;
				this.y   = y;
				if(this.x   != PANLE.WIDTH){
					image =ImageIO.read(new File(Constants.SHELL.SHELLD));	
				}else{

				}

			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
			break;


		default:
			break;
		}


	}
	
	

	//返回当前shell的位置
	public void move(){

		if ("w".equals(this.dir)) {
			
			
			if(this.y<=0){//怎么判断到达了边界
				this.isBoom = true;
				return ;
				
			}
			this.y -= step;
			System.out.println("当前的子弹y值"+this.y);
		}else if ("s".equals(this.dir)) {
			if(this.y>=555){
				this.isBoom = true;
				return ;
			}
			this.y += step;
			System.out.println("当前的子弹y值"+this.y);
		}
		else if ("a".equals(this.dir)) {
			if(this.x<= (-4)){
				isBoom = true;
				return ;		
			}
			this.x -= step;
			System.out.println("当前的子弹的x值"+this.x);

			
		}else if ("d".equals(this.dir)) {
			if(this.x>=570){
				isBoom = true;
				return ;
			}
			this.x += step;
			System.out.println("当前的子弹x值"+this.x);
		}



		/*
		switch (this.dir) {
		case "w":
			if(this.y<=0){
				this.isBoom = true;
				return ;
			}
			this.y -= step;

			break;
		case "s":
			if(this.y<0){
				this.isBoom = true;
				return ;
			}
			this.y += step;

			break;
		case "a":
			if(this.x<0){
				//isBoom = true;
				return ;
			}
			this.x -= step;

			break;

		case "d":
			if(this.x<0){

				//isBoom = true;
				return ;
			}
			this.x += step;

			break;
		}*/



	}

	/*//子弹的爆炸方法
	public void shellboom(){

		for (int i = 0; i < boomImage.size(); i++) { 
			image= boomImage.poll();
		}
	}*/

}
