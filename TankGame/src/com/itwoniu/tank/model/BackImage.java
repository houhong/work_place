package com.itwoniu.tank.model;

import java.awt.Paint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
/*
 * 背景图
 */

import com.itwoniu.tank.contents.Constants.HEROTANK;

public class BackImage {


	public BufferedImage image;
	//public BufferedImage image1;

	public BackImage() {
		try {
			
			image = ImageIO.read(new File("images/Win/backImg.png"));

			//image1 = ImageIO.read(new File(HEROTANK.HEROA_1_IMIMAGE));
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			System.out.println("图片加载失败");
			e.printStackTrace();
		}
	}




}
