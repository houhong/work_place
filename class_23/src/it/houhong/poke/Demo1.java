package it.houhong.poke;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import javax.lang.model.element.VariableElement;

import org.omg.PortableInterceptor.INACTIVE;

public class Demo1 {

	public Demo1() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
			
			//花色
			String[] pokeColor = new String[]{"♣","♤","♡","♢"};
		    ArrayList<String> initPoke = new ArrayList<>();
			//初始化扑克牌
			for (int i = 3; i <= 10; i++) {
				 int count=0;
				 for (int j = 0; j < pokeColor.length; j++) {
					
					 String num= String.valueOf(i)+pokeColor[j];
					 initPoke.add(num);
					 count++;
				}
				
			}
		
			for (int j = 0; j <pokeColor.length; j++) {
				String num = "A" +pokeColor[j];
				initPoke.add(num);	 	      
				      
			}

			for (int j = 0; j <pokeColor.length; j++) {
				 
				      String num = "J"+pokeColor[j];
				initPoke.add(num);
			         
			}

			for (int j = 0; j <pokeColor.length; j++) {
				 
				      String num = "Q"+pokeColor[j];
				initPoke.add(num);
			         
			}

			for (int j = 0; j <pokeColor.length; j++) {
				 
				      String num = "K"+pokeColor[j];
				initPoke.add(num);
			         
			}

			for (int j = 0; j <pokeColor.length; j++) {
				 
				      String num = "A"+pokeColor[j];
				initPoke.add(num);
			         
			}
			for (int j = 0; j <pokeColor.length; j++) {
				 
			      String num = "2"+pokeColor[j];
			initPoke.add(num);
		         
		}
			
			
			initPoke.add("小王");
			initPoke.add("大王");
		   /* for (String string : initPoke) {
				System.out.println(string);
			}*/
			
			Map<Integer, String> map = new HashMap<>();
			int index1 = 0;
			for (String string : initPoke) {
				  
				  map.put(index1, string);
				  index1++;
				  System.out.println(index1);
				  System.err.println(string);
			}
			
			Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
			
			/*while (iterator.hasNext()) {
				
				   Entry<Integer, String> next = iterator.next();
				   System.err.println("值是："+next.getKey()+":"+next.getValue());
			}*/
			
			Set<Integer> player1=new HashSet<>();
			Set<Integer> player2=new HashSet<>();
			Set<Integer> player3=new HashSet<>();
			
			//定义三个玩家
			String[] player = new String[]{"play01","play02","play03"};
			String[][] pai  = new String[][]{new String[17],new String[17],new String[17]};
			
			
			for (int i = 0; i < player.length; i++) {
				
				for (int j = 0; j < 17; j++) {
					Random ran = new Random();
					int index = ran.nextInt(initPoke.size());
				    pai[i][j]=initPoke.get(index);
				    initPoke.remove(index);
				}
			}
			
			 for (int i = 0; i < pai.length; i++) {
				  System.out.print("player"+i+" ");
				  for(int j=0; j<pai[i].length;j++){
					  	System.out.print(pai[i][j]);
				  }
				  System.out.println("\n");
			}
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

}
