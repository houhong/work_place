package com.it.houhong.model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
/*
 * ±≥æ∞Õº∆¨¿‡
 */

public class BackImage {


	public BufferedImage image;

	public BackImage() {
		
		try {
			image = ImageIO.read(new File("images/Win/backImg.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("º”‘ÿÕº∆¨ ß∞‹");
		}
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

}
