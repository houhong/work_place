package com.it.houhong.model;

import java.awt.image.BufferedImage;
/*
 * tank ��
 */

import java.util.Map;
import java.util.Random;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Tank {


	//������
	public int x,y;

	//̹���Լ����ٶ�
	public int step;
	//̹�˵ķ���
	public String tankDir;

	//���̹�˵ķ����ʵ��ͼƬ
	public Map<String, BufferedImage[]> dirMap;
	public BufferedImage[] images;


	//��С
	public int length,width;

	public Tank() {


	}


	//�õ���һ��ͼƬ
	public BufferedImage getFirst(){

		return dirMap.get(tankDir)[0];
	}



	//
	public void swap(){


		BufferedImage temp;
		temp = dirMap.get(tankDir)[0];
		dirMap.get(tankDir)[0]=dirMap.get(tankDir)[1];
		dirMap.get(tankDir)[1] =temp;


	}

	//����̹�˵ķ�λ
	public void move(String dir){


		switch (dir) {
		case "w":
			if (!dir.equals(tankDir)) {
				this.tankDir =dir;
			} else {
				this.y-=step;
			}

			break;
		case "s":
			if (!dir.equals(tankDir)) {
				this.tankDir =dir;
			} else {
				this.y+=step;
			}
			break;
		case "a":
			if (!dir.equals(tankDir)) {
				this.tankDir =dir;
			} else {
				this.x-=step;
			}
			break;
		case "d":
			if (!dir.equals(tankDir)) {
				this.tankDir =dir;
			} else {
				this.x+=step;
			}
			break;
		default:
			break;

		}




	}





	//̹�˵ķ�λ
	public void dir(String dir){

		images =dirMap.get(dir);

	}

	//�����λ��
	public int[]  randomXY(){

		int[] XY = new int[2];
		Random random = new Random();
		XY[0] = random.nextInt(600);
		XY[1] = random.nextInt(600);
		
		return XY;

	}
	
	
	public String dir(){
		String[] dir = new String[]{"w","a","s","d"};
		Random random = new Random();
		return dir[random.nextInt(4)];
	}
}


