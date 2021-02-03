package Exercicio12;

import java.util.Scanner;

public class LerNumeroThread implements Runnable {
	Scanner scan = new Scanner(System.in);
	
	public int c = 0; 
	public  int s = 0 ;
	public  int x, z;
	 
	@Override
	public void run() {
					
			System.out.println("Digite o primeiro valor:");
			x = scan.nextInt();
			
		do {
			System.out.println("Digite o segundo valor:");
			z = scan.nextInt();
			
			
			if(z < x) {
				System.out.println("ERRO O SEGUNDO VALOR NAO PODE SER MENOR QUE O PRIMEIRO!!");
			}
			
		}while( z < x);
		
		do {
			Thread t = new Thread();
		     try {
				Thread.sleep(5000);
				s = s + x; 
				System.out.println(s);
				c = c + 1;  
				System.out.println(c);
				x = x + 1;
				System.out.println(x);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 t.start();
		
			
		} while (s <= z);
		
		
		
		
	    
				
	}

}
	

	

	  