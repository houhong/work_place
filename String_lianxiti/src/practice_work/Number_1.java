package practice_work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * дһ������  -- һ����Ϸֻ������Σ� ���������Ϸ����
 */

public class Number_1 {

	public Number_1() {
		// TODO �Զ����ɵĹ��캯�����
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
