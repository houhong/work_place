package com.it.houhong.view;

import java.awt.Dimension;

import java.awt.Toolkit;

import javax.swing.JFrame;
/*
 * ��������
 */

public class GameFrame extends JFrame{

	public GameFrame() {
		
		//��ȡ��Ĭ�ϵĹ��߰�  --- ��swt�ṩ
		Toolkit dt = Toolkit.getDefaultToolkit();
		
		//��̬�Ļ�ȡ��Ļ�ֱ��ʣ�
		Dimension screenSize = dt.getScreenSize();
		
		int height = (int)screenSize.getHeight();
		int width =  (int)screenSize.getWidth();
		
		
		System.out.println(width);
		System.out.println(height);
		
		//���ô��ڴ�С
		this.setBounds((width-600)/2, (height-600)/2, 600, 600);
		
		//���ùرմ��ڵ�ʱ�򣬹ر������
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		//��ֹ����
		this.setResizable(false);
		
	
		
		//����������������ӽ�ȥ
		this.add(new GamePanle());
		
		this.setVisible(true);
		
	}
	
	
	
	

}
