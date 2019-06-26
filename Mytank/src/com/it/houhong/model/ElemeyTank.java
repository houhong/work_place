package com.it.houhong.model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

import com.it.houhong.constens.Constants;
import com.it.houhong.constens.Constants.TANK;
/*
 * �з�̹��
 */


public class ElemeyTank  extends Tank{
	
	//��ʼ�����췽��
	
	private BufferedImage[] imgae;

	public ElemeyTank() {
		
	  //̹�˵Ĵ�С
	  this.length=Constants.TANK.LENGTH;
	  this.width= Constants.TANK.WIDTH;
	  
		
	  dirMap = new HashMap<>();
		//���ͼƬ��

		try {

			images = new BufferedImage[2];
			images[0] = ImageIO.read(new File(TANK.ENEMYA));
			images[1] = ImageIO.read(new File(TANK.ENEMYA_1));

			dirMap.put("a", images);



			imgae = new BufferedImage[2];
			imgae[0] = ImageIO.read(new File(TANK.ENEMYD));
			imgae[1] = ImageIO.read(new File(TANK.ENEMYD_1));

			dirMap.put("d", imgae);


			imgae = new BufferedImage[2];
			imgae[0] = ImageIO.read(new File(TANK.ENEMYS));
			imgae[1] = ImageIO.read(new File(TANK.ENEMYS_1));

			dirMap.put("s", imgae);


			imgae = new BufferedImage[2];
			imgae[0] = ImageIO.read(new File(TANK.ENEMYW));
			imgae[1] = ImageIO.read(new File(TANK.ENEMYW_1));

			dirMap.put("w", imgae);



		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		
		
		//��ʼ��
		x=randomXY()[0];
		y =randomXY()[1];
		tankDir = dir();
		step = 15;
		
	}
	
	

}
