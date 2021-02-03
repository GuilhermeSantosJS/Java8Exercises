package Exercicio10;

import java.util.Scanner;

public class TesteThreadNums {

	private int num1, num2;
	
	
	public void run() throws InterruptedException {
		Scanner ler = new Scanner(System.in);
		
		
		
		System.out.println("Digite o primeiro numero:");
		num1 = ler.nextInt();
		
		System.out.println("Digite o segundo numero:");
		num2 = ler.nextInt();
		
		int result = num1 + num2;	
		
		Thread t = new Thread();
		Thread.sleep(5000);
		t.start();
		
	
		
			System.out.println("Resultado da soma: " + result);
		
		
	}
	
	
	
	
	
}
