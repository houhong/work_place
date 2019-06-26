package com.itwoniu.tank.utils;

import java.util.Random;

public class RandomUtils {

	public RandomUtils() {
		// TODO Auto-generated constructor stub
	}
	public static int  random(int num) {
		
		Random ran = new Random();
		return 	ran.nextInt(num);
	}

}
