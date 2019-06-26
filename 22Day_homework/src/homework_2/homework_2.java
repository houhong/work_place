package homework_2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
/*
 * 思路想反了： 如果次数大于<5 可以使用游戏：
 * 而不是游戏调用一次，数字在加以    talk is nothing, show your code!!!!
 */

public class homework_2 {

	public homework_2() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new  FileReader("f:\\次数.txt"));

		int read =br.read();
		//System.out.println(read);
		//	System.out.println(read);
		if(read <= 48){

			System.out.println("游戏结束,请付费！");
			br.close();

		}else{
			br.close();
			Game();

			BufferedWriter bw = new BufferedWriter(new FileWriter("f:\\次数.txt"));
			read-- ;

			bw.write(read);
			bw.close();
			System.out.println("你的玩次数还有："+(read-48));

			if(read == 48){
				BufferedWriter  bw1 = new BufferedWriter(new FileWriter(("f:\\次数.txt")));
				bw1.write(5);
			}

		}
	}



	public static void Game(){

	}

}
