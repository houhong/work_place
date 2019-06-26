package practice_work;
/*
 * 1.将a.txt文件中的单词与b.txt文件中的单词交替合并到c.txt文件中，
 *   a.txt文件中的单词用回车符分隔，b.txt文件中用回车或空格进行分隔
 */
/*
 * 1.将a.txt文件中的单词与b.txt文件中的单词交替合并到c.txt文件中，
 *   a.txt文件中的单词用回车符分隔，b.txt文件中用回车或空格进行分隔
 *
 */

import java.io.File;  

import java.io.FileReader;  

import java.io.FileWriter;  



public class Test{  

	public static void main(String [] args) throws Exception{  

		FileWriter ra = new FileWriter("a.txt");//字符流  

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

		//交替写入           `

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

