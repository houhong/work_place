package practice_work;
/*
 * 1.��a.txt�ļ��еĵ�����b.txt�ļ��еĵ��ʽ���ϲ���c.txt�ļ��У�
 *   a.txt�ļ��еĵ����ûس����ָ���b.txt�ļ����ûس���ո���зָ�
 */
/*
 * 1.��a.txt�ļ��еĵ�����b.txt�ļ��еĵ��ʽ���ϲ���c.txt�ļ��У�
 *   a.txt�ļ��еĵ����ûس����ָ���b.txt�ļ����ûس���ո���зָ�
 *
 */

import java.io.File;  

import java.io.FileReader;  

import java.io.FileWriter;  



public class Test{  

	public static void main(String [] args) throws Exception{  

		FileWriter ra = new FileWriter("a.txt");//�ַ���  

		ra.write("111\n222\n333\n444\n555\n");  

		ra.close();  

		FileWriter rb = new FileWriter("b.txt");  

		rb.write("aaaa\nbbbb\ncccc\ndddd\neeee\n");  

		rb.close();  

		FileManager a = new FileManager("a.txt", new char[]{'\n'});  

		FileManager b = new FileManager("b.txt", new char[]{'\n',' '});  

		FileWriter  c = new FileWriter("c.txt");  

		String aWord = null;  

		String bWord = null;  

		//����д��           `

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

		if (pos == words.length) {
			return null;
		}
		
		return words[pos];
	}








	/*   public String nextWord(){  

        if(pos==words.length){  

            return null;  

        }  

        return words[pos++];          

    }  */

}  

