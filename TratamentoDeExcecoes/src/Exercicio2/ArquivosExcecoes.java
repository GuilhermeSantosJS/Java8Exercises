package Exercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArquivosExcecoes {
	public static void main(String[] args) throws IOException{
		

		     BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader("c:/nome.txt"));
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		     BufferedReader br2 = null;
			try {
				br2 = new BufferedReader(new FileReader("c:/sobrenome.txt"));
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		     while(br.ready() && br2.ready()){
		        String l = br.readLine();
		        String li = br2.readLine();
		        System.out.printf(l.concat(li));
		        
		     }
		     br.close();
		     br2.close();
		     
		     
		  
		
	}
}



