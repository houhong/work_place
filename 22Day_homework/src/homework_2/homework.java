package homework_2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;

public class homework {

	public homework() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) throws Exception{
		
		 BufferedReader br = new BufferedReader(new FileReader("f:\\demo.java"));
		 String read= null;
		 StringBuffer Buffer;
		 int j=1;
		 while((read =br.readLine())!=null){
			    
			 String row = String.valueOf(j).concat("   ");
		    // String out= String.valueOf(j).concat(read);
			 String out=row.concat(read);
		     j++;
		     System.out.println(out);
			 
		 }
		 br.close();
	}
}
