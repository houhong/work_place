package com.woniu.it.��ϰ��;

/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

 *  ��дһ�����򣬽� a.txt �ļ��еĵ����� b.txt �ļ��еĵ��ʽ���ϲ��� c.txt �ļ��С�

	a.txt �ļ��еĵ����ûس����ָ���b.txt �ļ����ûس���ո���зָ�
 
import java.io.FileWriter;

public class Demo11 {

	public Demo11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		//�����߳�ͬ����
		Object obj = new Object();//key

		//��ӡa�ļ�
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

		//��ӡb�ļ�
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
	//a�ļ���b�ļ�����



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

        //����д��          

        while((aWord=a.nextWord())!=null){  

            c.write(aWord+"\n");  

            bWord = b.nextWord();  

            if(bWord!=null){  

                c.write(bWord+"\n");  

            }             

        }  

        //���b����  

        while((bWord=b.nextWord())!=null){  

            c.write(bWord+"\n");  

        }  

        c.close();  

    }  

}  

  

class FileManager{  

    String[] words = null; 

    int pos = 0;//words������  

    /** 

     * �����ļ���Ϣ�����ݷָ����������ַ�������words��  

     * @param filename 

     * @param seperators 

     * @throws Exception 

     */  

    public FileManager(String filename, char[] seperators) throws Exception{  

        File f = new File(filename);  

        FileReader reader = new FileReader(filename);//�ļ��ַ���  

        char[] buf = new char[(int)f.length()];//f���ļ��ַ���һ����  

        int len = reader.read(buf);//��ȡ�ĳ���---С�ļ���һ���Զ�ȡ  

        String results = new String(buf,0,len);  

        String regex = null;//������ʽ  

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

     * ���ص�ǰposλ�õ�words[pos]��Ȼ�����pos����pos++ 

     * @return 

     */  

    public String nextWord(){  

        if(pos==words.length){  

            return null;  

        }  

        return words[pos++];          

    }  

}  

