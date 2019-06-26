package com.it.houhong.model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

import com.it.houhong.constens.Constants.TANK;

public class HeroTank extends Tank{


	public HeroTank() {

		try {
			
			//初始化移动速度
			this.step =TANK.HERO_STEP;
			//控制方向
			dirMap =new HashMap<>();

			//放坦克的方位
			images = new BufferedImage[2];

			images[0] = ImageIO.read(new File(TANK.HEROA));
			images[1]  = ImageIO.read(new File(TANK.HEROA_1));
			dirMap.put("a", images);
			
			images = new BufferedImage[2];
			images[0] = ImageIO.read(new File(TANK.HEROS));
			images[1]  = ImageIO.read(new File(TANK.HEROS_1));
			dirMap.put("s", images);
			
			images = new BufferedImage[2];
			images[0] = ImageIO.read(new File(TANK.HEROD));
			images[1]  = ImageIO.read(new File(TANK.HEROD_1));
			dirMap.put("d", images);
			
			
			images = new BufferedImage[2];
			images[0] = ImageIO.read(new File(TANK.HEROW));
			images[1]  = ImageIO.read(new File(TANK.HEROW_1));
			dirMap.put("w", images);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		x=0;
		y=0;
		tankDir = "d";
	}




}
