package com.it.houhong;


public   class  AppMain
//����ʱ, jvm ��appmain����Ϣ�����뷽����
{
	public   static   void  main(String[] args)  //main ����������뷽������
	{
		//��ʱAPPMIAN��һ��procedure count pc -- ���������;
		//����һ������ջ -- ���ڴ��test1 , test2 ������
		Sample test1 = new  Sample( " ����1 " );   //test1�����ã����Էŵ�ջ��� Sample���Զ������Ӧ�÷ŵ�������
		Sample test2 = new  Sample( " ����2 " );
		test1.printName();
		test2.printName();
	}
}

	class  Sample {       //����ʱ, jvm ��appmain����Ϣ�����뷽����

		/** �������� */
		private String  name;      //new Sampleʵ���� name ���÷���ջ���  name ����������
		/** ���췽�� */
		public  Sample(String name)
		{
			this .name = name;
		}
		/** ��� */
		public   void  printName()   //print����������� �������
		{
			System.out.println(name);
		}
	}


