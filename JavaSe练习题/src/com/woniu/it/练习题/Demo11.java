package com.woniu.it.练习题;

/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

 *  编写一个程序，将 a.txt 文件中的单词与 b.txt 文件中的单词交替合并到 c.txt 文件中。

	a.txt 文件中的单词用回车符分隔，b.txt 文件中用回车或空格进行分隔
 
import java.io.FileWriter;

public class Demo11 {

	public Demo11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		//利用线程同步？
		Object obj = new Object();//key

		//打印a文件
		new Thread(new Runnable() {

			@Override
			public void run() {

				String read =null;
				try {
					BufferedReader br = new BufferedReader(new FileReader(new File("e:\\a.txt")));
					BufferedWriter bw = new BufferedWriter(new FileWriter(new File("e:\\c.txt")));
					while ((read=br.readLine())!=null) {
						synchronized (obj) {
							bw.write(read);
							if (br!=null ) {
								br.close();
							}
							if (bw!=null) {
								bw.close();
							}

							obj.notify();

							obj.wait();

						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}



			}
		}).start();

		//打印b文件
		new Thread(new Runnable() {

			@Override
			public void run() {

				String read = null;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				try {
					BufferedReader br = new BufferedReader(new FileReader(new File("e:\\b.txt")));
					BufferedWriter bw = new BufferedWriter(new FileWriter(new File("e:\\c.txt")));
					while ((read=br.readLine())!=null) {
						synchronized (obj) {
							bw.write(read);
							if (br!=null ) {
								br.close();
							}
							if (bw!=null) {
								bw.close();
							}

							obj.notify();

							obj.wait();

						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			}
		}).start();
	}
	//a文件和b文件交替



}
*/

import java.io.File;  

import java.io.FileReader;  

import java.io.FileWriter;  

  

public class Demo11{  

    public static void main(String [] args) throws Exception{  

        FileManager a = new FileManager("e:\\a.txt", new char[]{'\n'});  

        FileManager b = new FileManager("e:\\b.txt", new char[]{'\n',' '});  

        FileWriter  c = new FileWriter("e:\\c.txt");  

        String aWord = null;  

        String bWord = null;  

        //交替写入          

        while((aWord=a.nextWord())!=null){  

            c.write(aWord+"\n");  

            bWord = b.nextWord();  

            if(bWord!=null){  

                c.write(bWord+"\n");  

            }             

        }  

        //如果b还有  

        while((bWord=b.nextWord())!=null){  

            c.write(bWord+"\n");  

        }  

        c.close();  

    }  

}  

  

class FileManager{  

    String[] words = null; 

    int pos = 0;//words的索引  

    /** 

     * 读入文件信息，根据分隔符，存入字符串数组words中  

     * @param filename 

     * @param seperators 

     * @throws Exception 

     */  

    public FileManager(String filename, char[] seperators) throws Exception{  

        File f = new File(filename);  

        FileReader reader = new FileReader(filename);//文件字符流  

        char[] buf = new char[(int)f.length()];//f和文件字符流一样大  

        int len = reader.read(buf);//读取的长度---小文件，一次性读取  

        String results = new String(buf,0,len);  

        String regex = null;//正则表达式  

        if(seperators.length>1){  

            regex=""+seperators[0]+"|"+seperators[1];  

        }  

        else{  

            regex=""+seperators[0];           

        }  

        words=results.split(regex);  

        reader.close();  

    }  

    /** 

     * 返回当前pos位置的words[pos]，然后后移pos，即pos++ 

     * @return 

     */  

    public String nextWord(){  

        if(pos==words.length){  

            return null;  

        }  

        return words[pos++];          

    }  

}  

