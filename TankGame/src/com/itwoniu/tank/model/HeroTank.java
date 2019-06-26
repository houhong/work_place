package com.itwoniu.tank.model;

import java.awt.image.BufferedImage;
/*
 * model  --tank  --- �������  -- ̹��
 */

import java.io.File;
import java.io.IOException;
import java.util.HashMap;





import javax.imageio.ImageIO;
import javax.swing.RepaintManager;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.itwoniu.tank.contents.Constants;
import com.itwoniu.tank.contents.Constants.HEROTANK;
import com.itwoniu.tank.contents.Constants.PANLE;
import com.itwoniu.tank.contents.Constants.WIN;

public class HeroTank {
	
	//�ж�̹���Ƿ񱻻���
	public boolean isShit;
	
	public BufferedImage[]	imgae;
	public HashMap<String,BufferedImage[]> dir;



	//̹�˵�����
	public int x;
	public int y ;
	public int step;

	//̹�˷���
	public  String tankDir ;

	//̹�˵Ĵ�С
	public int  TANK_LENGTH ;
	public int  TANK_WIDTH ;

	public HeroTank() {
		
		isShit =false;
		this.TANK_LENGTH = Constants.HEROTANK.TANK_LENGTH;
		this.TANK_WIDTH  = Constants.HEROTANK.TANK_WIDTH ;
		dir = new HashMap<>();
		//���ͼƬ��

		try {

			imgae = new BufferedImage[2];
			imgae[0] = ImageIO.read(new File(HEROTANK.HEROA));
			imgae[1] = ImageIO.read(new File(HEROTANK.HEROA_1));

			dir.put("a", imgae);



			imgae = new BufferedImage[2];
			imgae[0] = ImageIO.read(new File(HEROTANK.HEROD));
			imgae[1] = ImageIO.read(new File(HEROTANK.HEROD_1));

			dir.put("d", imgae);


			imgae = new BufferedImage[2];
			imgae[0] = ImageIO.read(new File(HEROTANK.HEROS));
			imgae[1] = ImageIO.read(new File(HEROTANK.HEROS_1));

			dir.put("s", imgae);


			imgae = new BufferedImage[2];
			imgae[0] = ImageIO.read(new File(HEROTANK.HEROW));
			imgae[1] = ImageIO.read(new File(HEROTANK.HEROW_1));

			dir.put("w", imgae);



		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		
		
		//��ʼ��
		x=0;
		y =0;
		tankDir = "s";
		step = 15;





	}


	public BufferedImage getFirst(){


		return dir.get(tankDir)[0];
	}

	public void swap(){
		BufferedImage temp = dir.get(tankDir)[0];
		dir.get(tankDir)[0] = dir.get(tankDir)[1];
		dir.get(tankDir)[1] = temp;
	}
	/*
	 * ̹���ƶ�
	 */

	public void move(String keyDir ){
		//����������ķ���͵�ǰ����һ�£��ͷ���
		if (!this.tankDir.equals(keyDir)) {
			this.tankDir = keyDir;
		} else {
			if("w".equals(keyDir)){
				this.y -= this.step;
				System.out.println("��ǰ̹�˵�yֵ"+this.y);
				System.out.println("��ǰ̹�˵�xֵ"+this.x);
				if(this.y <= 0){
					this.y =0;
				}
			}
			else if("s".equals(keyDir)){

				this.y+=this.step;
				System.out.println("��ǰ��̹��yֵ"+this.y);
				System.out.println("��ǰ̹�˵�xֵ"+this.x);
				if(this.y ==520){
					this.y =PANLE.HIGH - TANK_LENGTH;
				}
				
			}
			else if("a".equals(keyDir)){

				this.x -=this.step;
				System.out.println("��ǰ��̹�˵�xֵ"+this.x);
				System.out.println("��ǰ��̹��yֵ"+this.y);
				if(this.x == (-30)){
					this.x = PANLE.WIDTH;
				}
			}
			else if("d".equals(keyDir)){

				this.x+=this.step;
				System.out.println("��ǰ��̹��xֵ"+this.x);
				System.out.println("��ǰ��̹��yֵ"+this.y);
				if(this.x >=570){
					this.x = 0;
				}
			}
		}
	}

}





