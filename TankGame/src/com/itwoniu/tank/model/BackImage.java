package com.itwoniu.tank.model;

import java.awt.Paint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
/*
 * ����ͼ
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
			// TODO �Զ����ɵ� catch ��
			System.out.println("ͼƬ����ʧ��");
			e.printStackTrace();
		}
	}




}
