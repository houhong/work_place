package practice_work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * 写一个程序  -- 一个游戏只能玩五次： 超出输出游戏结束
 */

public class Number_1 {

	public Number_1() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) throws Exception{




		BufferedReader br = new BufferedReader( new FileReader("e:\\record.txt"));

		int  data =br.read();
		System.out.println(data);
		br.close();

		if(data!=48){
			game();
			data--;
			BufferedWriter bw = new BufferedWriter(new FileWriter("e:\\record.txt"));
			bw.write(data);
			bw.close();
		}else{
			System.out.println("game over !!!!!");
		}


	}
	public static void game(){
		System.out.println("11111");
	}

}
