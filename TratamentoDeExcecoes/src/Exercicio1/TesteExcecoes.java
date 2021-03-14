package Exercicio1;

import java.util.Scanner;

public class TesteExcecoes {

	public static void main(String[] args) {
		
		
		/*TratandoExcecoes tr = new TratandoExcecoes();
		try {
	    Scanner s = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");	
		tr.setX(s.nextInt());
		System.out.println();	
		System.out.println("Digite o segundo valor: ");
		tr.setY(s.nextInt());
		tr.TesteExcecaoNegativa();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finalizada a execucão do metodo");
		}*/
		
		
		/*TratandoExcecoes tr2 = new TratandoExcecoes();
		try {
		    Scanner s1 = new Scanner(System.in);
			System.out.println("Digite o primeiro valor: ");	
			tr2.setX(s1.nextInt());
			System.out.println();	
			System.out.println("Digite o segundo valor: ");
			tr2.setY(s1.nextInt());
			tr2.TesteDivisaoPorZero();
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}finally {
				System.out.println("Finalizada a execucão do metodo");
			}*/
		
		 TratandoExcecoes tr3 = new TratandoExcecoes();
		 try {
			    Scanner s1 = new Scanner(System.in);
				System.out.println("Digite o primeiro valor: ");	
				tr3.setX(s1.nextInt());
				System.out.println();	
				System.out.println("Digite o segundo valor: ");
				tr3.setY(s1.nextInt());
				tr3.TesteExcecaoNegativa();
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					System.out.println("Finalizada a execucão do metodo");
				}
		
		
	}

}
