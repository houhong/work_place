	package com.woniuxy.demo;
	/*
	 * 1.�����ַ������Ӵ����ֵĴ���
	   	��:�������ַ�����abcdjsaaabcbsaaadda
	     �������Ӵ���aa
	    �Ӵ����ַ����г���: 4 ��
	 */
	
	public class Demo1 {
	
		public Demo1() {
			// TODO Auto-generated constructor stub
		}
		public static void main(String[] args) {
				System.out.println(function("123", "ab"));
		
		}
	
		public static int function(String str,String sub){
			
			int count = 0;
			
			while(str.length()>=0){
				int index = str.indexOf(sub);
				if(index != -1){
					
					index+=1;
					str = str.substring(index);
					count++;
					
				}else {
					break;
				}	 
			}
			return count;
		
		}
	
	}