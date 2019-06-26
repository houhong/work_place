package com.it.houhong.view;

import java.awt.Dimension;

import java.awt.Toolkit;

import javax.swing.JFrame;
/*
 * 窗口设置
 */

public class GameFrame extends JFrame{

	public GameFrame() {
		
		//获取到默认的工具包  --- 由swt提供
		Toolkit dt = Toolkit.getDefaultToolkit();
		
		//动态的获取屏幕分辨率：
		Dimension screenSize = dt.getScreenSize();
		
		int height = (int)screenSize.getHeight();
		int width =  (int)screenSize.getWidth();
		
		
		System.out.println(width);
		System.out.println(height);
		
		//设置窗口大小
		this.setBounds((width-600)/2, (height-600)/2, 600, 600);
		
		//设置关闭窗口的时候，关闭虚拟机
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		//禁止缩放
		this.setResizable(false);
		
	
		
		//添加组件：将画笔添加进去
		this.add(new GamePanle());
		
		this.setVisible(true);
		
	}
	
	
	
	

}
