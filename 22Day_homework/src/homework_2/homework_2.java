package homework_2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
/*
 * ˼·�뷴�ˣ� �����������<5 ����ʹ����Ϸ��
 * ��������Ϸ����һ�Σ������ڼ���    talk is nothing, show your code!!!!
 */

public class homework_2 {

	public homework_2() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new  FileReader("f:\\����.txt"));

		int read =br.read();
		//System.out.println(read);
		//	System.out.println(read);
		if(read <= 48){

			System.out.println("��Ϸ����,�븶�ѣ�");
			br.close();

		}else{
			br.close();
			Game();

			BufferedWriter bw = new BufferedWriter(new FileWriter("f:\\����.txt"));
			read-- ;

			bw.write(read);
			bw.close();
			System.out.println("�����������У�"+(read-48));

			if(read == 48){
				BufferedWriter  bw1 = new BufferedWriter(new FileWriter(("f:\\����.txt")));
				bw1.write(5);
			}

		}
	}



	public static void Game(){

	}

}
