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
 * �ӵ���
 */

public class Shell {


	//��ըͼƬ
	//�̰߳�ȫ�ļ���
	public CopyOnWriteArrayList<BufferedImage> boomImage;
	
	//��Ҫɾ�����ӵ�����
	public ArrayList<Shell> deleteShell;

	//�ӵ�������
	public BufferedImage image;

	public String dir;
	//�ӵ�������
	public int x;
	public int y;

	//�ӵ��Ĵ�С
	public int length;
	public int width;

	//�ӵ����ƶ��ٶ�   ---Ĭ��Ϊ16
	public int step =15;


	public boolean isBoom ;






	public Shell(String dir,int x,int y) {
		
		//�����ӵ���С
		this.length = Constants.SHELL.SHELL_LENGTH;
		this.width  = Constants.SHELL.SHELL_WIDTH;
		//�ж��ӵ��Ƿ�ը
		this.isBoom = false;
		boomImage = new CopyOnWriteArrayList<>();

		//���ñ�ըͼƬ
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
			// TODO �Զ����ɵ� catch ��
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
				// TODO �Զ����ɵ� catch ��
				e1.printStackTrace();
			}
			break;
		case "a":
			try {
				image =ImageIO.read(new File(Constants.SHELL.SHELLA));
				this.x   = x -64;
				this.y   = y  ;
			} catch (IOException e1) {
				// TODO �Զ����ɵ� catch ��
				e1.printStackTrace();
			}
			break;

		case "s":
			try {
				image =ImageIO.read(new File(Constants.SHELL.SHELLS));
				this.x   = x-32;
				this.y   = y+32;
			} catch (IOException e1) {
				// TODO �Զ����ɵ� catch ��
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
				// TODO �Զ����ɵ� catch ��
				e1.printStackTrace();
			}
			break;


		default:
			break;
		}


	}
	
	

	//���ص�ǰshell��λ��
	public void move(){

		if ("w".equals(this.dir)) {
			
			
			if(this.y<=0){//��ô�жϵ����˱߽�
				this.isBoom = true;
				return ;
				
			}
			this.y -= step;
			System.out.println("��ǰ���ӵ�yֵ"+this.y);
		}else if ("s".equals(this.dir)) {
			if(this.y>=555){
				this.isBoom = true;
				return ;
			}
			this.y += step;
			System.out.println("��ǰ���ӵ�yֵ"+this.y);
		}
		else if ("a".equals(this.dir)) {
			if(this.x<= (-4)){
				isBoom = true;
				return ;		
			}
			this.x -= step;
			System.out.println("��ǰ���ӵ���xֵ"+this.x);

			
		}else if ("d".equals(this.dir)) {
			if(this.x>=570){
				isBoom = true;
				return ;
			}
			this.x += step;
			System.out.println("��ǰ���ӵ�xֵ"+this.x);
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

	/*//�ӵ��ı�ը����
	public void shellboom(){

		for (int i = 0; i < boomImage.size(); i++) { 
			image= boomImage.poll();
		}
	}*/

}
