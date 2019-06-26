package com.houhong.Observer1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class TestFrame extends Frame{
	
	
	public void launch(){
		
		 Button button = new Button();
		 button.addActionListener(new MyaxtionLitener());
		 button.addActionListener(new MyactionListener2());
		 
		 this.add(button);
		 this.pack();//È«¸²¸Ç
		 
		 this.addWindowListener((WindowListener) );
		 
		 
	}

	public TestFrame() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
			
	}
	private class MyaxtionLitener implements ActionListener{

		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("button pressed");
		}
		
	}
	private class MyactionListener2 implements ActionListener{

	
		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("button pressed");
		}
		
	}

}
