package com.itwoniu.tank.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import com.itwoniu.tank.contents.Constants;
import com.itwoniu.tank.contents.Constants.WIN;
 
public class GameFrame  extends JFrame{

	public GameFrame() {
		
		//thisrame ���ṩ���ڵ�һ�����
		

		//��̬��ȡ������Ļ�ֱ���
		Toolkit dt   = Toolkit.getDefaultToolkit();
		
		//�ֱ���
		Dimension ss = dt.getScreenSize();
		int width = (int)ss.getWidth();
		int  height = (int)ss.getHeight();
		
		System.out.println(width);
		System.out.println(height);

		//���õ�λ��
		this.setBounds((width-WIN.HIGH)/2, (height-WIN.WIDTH)/2, WIN.HIGH, WIN.WIDTH);
		
		//���ùرմ��ڵ�ͬʱ�ر������
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		//��ֹ����   ----��ֹ����
		this.setResizable(false);
		
		this.setTitle("           ̹�˴��Ҷ�                  ");
		
		
		//������ --- ����
		this.add(new GamePane());

		//���ÿɼ����������
		this.setVisible(true);// TODO �Զ����ɵĹ��캯�����
	}
	
	
		

}
