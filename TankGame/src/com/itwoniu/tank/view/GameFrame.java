package com.itwoniu.tank.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import com.itwoniu.tank.contents.Constants;
import com.itwoniu.tank.contents.Constants.WIN;
 
public class GameFrame  extends JFrame{

	public GameFrame() {
		
		//thisrame 是提供窗口的一个组件
		

		//动态获取电脑屏幕分辨率
		Toolkit dt   = Toolkit.getDefaultToolkit();
		
		//分辨率
		Dimension ss = dt.getScreenSize();
		int width = (int)ss.getWidth();
		int  height = (int)ss.getHeight();
		
		System.out.println(width);
		System.out.println(height);

		//设置的位置
		this.setBounds((width-WIN.HIGH)/2, (height-WIN.WIDTH)/2, WIN.HIGH, WIN.WIDTH);
		
		//设置关闭窗口的同时关闭虚拟机
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		//禁止缩放   ----禁止缩放
		this.setResizable(false);
		
		this.setTitle("           坦克大乱斗                  ");
		
		
		//添加组件 --- 容器
		this.add(new GamePane());

		//设置可见，放在最后
		this.setVisible(true);// TODO 自动生成的构造函数存根
	}
	
	
		

}
