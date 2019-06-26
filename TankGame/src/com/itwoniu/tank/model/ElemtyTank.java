package com.itwoniu.tank.model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

import javax.imageio.ImageIO;

import com.itwoniu.tank.contents.Constants;
import com.itwoniu.tank.contents.Constants.HEROTANK;
import com.itwoniu.tank.contents.Constants.PANLE;
/*
 * ���õз�̹��
 */

public class ElemtyTank extends HeroTank {

	//public boolean isShit;//����з�̹���Ƿ񱻻��У�Ĭ��ȫû������

	public ElemtyTank() {
		
		
		this.isShit = false;//��ʼ��Ϊû������	
		
		this.tankDir = emlemyDir();
		//�õ������xy
		this.x = this.RannomXY();
		this.y = this.RannomXY();
		
		this.dir=new HashMap<>();


		this.TANK_LENGTH = Constants.ENEMY.ELEMY_LENGTH;
		this.TANK_WIDTH  = Constants.ENEMY.ELEMY_WIDTH ;

		//this.dir = new HashMap<>();
		//���ͼƬ��

		try {
			
			this.imgae = new BufferedImage[2];
			this.imgae[0] = ImageIO.read(new File(Constants.ENEMY.SHELLA));
			this.imgae[1] = ImageIO.read(new File(Constants.ENEMY.SHELLA_1));

			this.dir.put("a", imgae);



			imgae = new BufferedImage[2];
			imgae[0] = ImageIO.read(new File(Constants.ENEMY.SHELLD));
			imgae[1] = ImageIO.read(new File(Constants.ENEMY.SHELLD_1));

			this.dir.put("d", imgae);


			imgae = new BufferedImage[2];
			imgae[0] = ImageIO.read(new File(Constants.ENEMY.SHELLS));
			imgae[1] = ImageIO.read(new File(Constants.ENEMY.SHELLS_1));

			this.dir.put("s", imgae);


			imgae = new BufferedImage[2];
			imgae[0] = ImageIO.read(new File(Constants.ENEMY.SHELLW));
			imgae[1] = ImageIO.read(new File(Constants.ENEMY.SHELLW_1));

			this.dir.put("w", imgae);



		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}




	public int RannomXY(){

		Random random = new Random();

		return random.nextInt((PANLE.WIDTH -40));

	}


	//�����������

	public String emlemyDir(){

		String[] dirArr = new String[]{"w","s","d","a"};
		Random random = new Random();

		return dirArr[random.nextInt(4)];

	}





	@Override
	public void move(String keyDir) {
		//����������ķ���͵�ǰ����һ�£��ͷ���
		if (!this.tankDir.equals(keyDir)) {
			this.tankDir = keyDir;
		} else {
			if("w".equals(keyDir)){
				this.y -=( this.step*2);
				System.out.println("��ǰ̹�˵�yֵ"+this.y);
				System.out.println("��ǰ��̹�˵�xֵ"+this.x);
				if(this.y <= 0){
					this.y =300;
				}
			}
			else if("s".equals(keyDir)){

				this.y+=( this.step*2);
				System.out.println("��ǰ��̹��yֵ"+this.y);
				System.out.println("��ǰ��̹�˵�xֵ"+this.x);
				if(this.y >=520){
					this.y =0;
				}

			}
			else if("a".equals(keyDir)){

				this.x -=( this.step*2);
				System.out.println("��ǰ��̹�˵�xֵ"+this.x);
				System.out.println("��ǰ��̹��yֵ"+this.y);
				if(this.x <=0){
					this.x = 400;
				}
			}
			else if("d".equals(keyDir)){

				this.x+=( this.step*2);
				System.out.println("��ǰ��̹��xֵ"+this.x);
				System.out.println("��ǰ��̹��yֵ"+this.y);
				if(this.x >=570){
					this.x = 0;
				}
			}
		}
	}





}
