package com.itwoniu.tank.model;

import java.awt.image.BufferedImage;
/*
 * ̹����
 */
import java.util.HashMap;

public class Tank {

	//̹�˵�ͼƬ
	private BufferedImage[]	imgae;
	private  HashMap<String,BufferedImage[]> dir;

	//̹�˵�����
	private  int x;
	private  int y;

	//�ӵ��Ĵ�С
	private  int length;	
	private int width;


	//̹�˵Ĳ���
	private  int step;

	//̹�˷���
	private  String tankDir ;


	public Tank() {

	}


	
	
	
	
	//̹�˵��ƶ�����
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
