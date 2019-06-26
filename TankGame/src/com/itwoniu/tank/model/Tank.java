package com.itwoniu.tank.model;

import java.awt.image.BufferedImage;
/*
 * 坦克类
 */
import java.util.HashMap;

public class Tank {

	//坦克的图片
	private BufferedImage[]	imgae;
	private  HashMap<String,BufferedImage[]> dir;

	//坦克的坐标
	private  int x;
	private  int y;

	//子弹的大小
	private  int length;	
	private int width;


	//坦克的步伐
	private  int step;

	//坦克方向
	private  String tankDir ;


	public Tank() {

	}


	
	
	
	
	//坦克的移动方法
	public void move(){

	}






	public BufferedImage[] getImgae() {
		return imgae;
	}






	public void setImgae(BufferedImage[] imgae) {
		this.imgae = imgae;
	}






	public HashMap<String, BufferedImage[]> getDir() {
		return dir;
	}






	public void setDir(HashMap<String, BufferedImage[]> dir) {
		this.dir = dir;
	}






	public int getX() {
		return x;
	}






	public void setX(int x) {
		this.x = x;
	}






	public int getY() {
		return y;
	}






	public void setY(int y) {
		this.y = y;
	}






	public int getLength() {
		return length;
	}






	public void setLength(int length) {
		this.length = length;
	}






	public int getWidth() {
		return width;
	}






	public void setWidth(int width) {
		this.width = width;
	}






	public int getStep() {
		return step;
	}






	public void setStep(int step) {
		this.step = step;
	}

	
	
	public String getTankDir() {
		return tankDir;
	}






	public void setTankDir(String tankDir) {
		this.tankDir = tankDir;
	}



}
