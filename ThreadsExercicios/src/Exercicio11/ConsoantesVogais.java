package Exercicio11;

import java.util.Scanner;

public class ConsoantesVogais implements Runnable {

	Scanner s = new Scanner (System.in);
	
	private String frase;
	int vogal = 0
	, consoante = 0;
	
	
	@Override
	public void run() {
		
		try {
			
		      
	        System.out.println("Digite sua frase:");
	        frase = s.nextLine();
	         
	        frase = frase.toLowerCase();
	        
	        for(int i = 0; i < frase.length(); i++){
	            char c = frase.charAt(i);
	            if(c == 32) continue;
	            if(c == 97 | c == 101 | c == 105 | c == 111 | c == 117){
	                vogal++;
	                continue;
	            }
	            if(c >= 98 && c <= 122) consoante++;
	        }
	        
	    	Thread t = new Thread();
			t.start();
			Thread.sleep(5000);
			
			
		}	catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Na frase \""+frase+"\" temos:\nVogais: "+vogal+"\nConsoantes: "+ consoante);
		
	}
}
	
	
	
		 
		 
		 
	
	
	

