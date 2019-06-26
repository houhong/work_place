package com.it.houhong.model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

import com.it.houhong.constens.Constants;
import com.it.houhong.constens.Constants.TANK;
/*
 * 敌方坦克
 */


public class ElemeyTank  extends Tank{
	
	//初始化构造方法
	
	private BufferedImage[] imgae;

	public ElemeyTank() {
		
	  //坦克的大小
	  this.length=Constants.TANK.LENGTH;
	  this.width= Constants.TANK.WIDTH;
	  
		
	  dirMap = new HashMap<>();
		//存放图片的

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
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
		
		//初始化
		x=randomXY()[0];
		y =randomXY()[1];
		tankDir = dir();
		step = 15;
		
	}
	
	

}
