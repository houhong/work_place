package com.it.houhong;


public   class  AppMain
//运行时, jvm 把appmain的信息都放入方法区
{
	public   static   void  main(String[] args)  //main 方法本身放入方法区。
	{
		//此时APPMIAN有一个procedure count pc -- 程序计数器;
		//还有一个虚拟栈 -- 用于存放test1 , test2 的引用
		Sample test1 = new  Sample( " 测试1 " );   //test1是引用，所以放到栈区里， Sample是自定义对象应该放到堆里面
		Sample test2 = new  Sample( " 测试2 " );
		test1.printName();
		test2.printName();
	}
}

	class  Sample {       //运行时, jvm 把appmain的信息都放入方法区

		/** 范例名称 */
		private String  name;      //new Sample实例后， name 引用放入栈区里，  name 对象放入堆里
		/** 构造方法 */
		public  Sample(String name)
		{
			this .name = name;
		}
		/** 输出 */
		public   void  printName()   //print方法本身放入 方法区里。
		{
			System.out.println(name);
		}
	}


