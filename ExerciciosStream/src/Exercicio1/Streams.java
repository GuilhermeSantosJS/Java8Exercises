package Exercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Streams {

	
	public void ListaNums() {
     Scanner scan = new Scanner(System.in);
		
		int n;
		System.out.println("Digite o ultimo numero da lista:");
		n = scan.nextInt();
		
		List<Integer> lista = Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,n);

		
		lista.stream()
		.forEach(e -> System.out.println(e));
		
	}
	
	public void ListaSemRepeticao() {
		
    List<Integer> lista = Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9);

		
		lista.stream()
		.distinct()
		.forEach(e -> System.out.println(e));
		
	}
	
	
	public void ListaImparesSemRepeticao() {
		
	    List<Integer> lista = Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9);

			
			lista.stream()
			.distinct()
			.filter(e -> e % 2 == 1)
			.forEach(e -> System.out.println(e));
			
		}
	
     public void ListaParesSemRepeticao() {
		
	    List<Integer> lista = Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9);

			
			lista.stream()
			.distinct()
			.filter(e -> e % 2 == 0)
			.forEach(e -> System.out.println(e));
			
		}
     
     public void ListaPorAlgarismoSemRepeticao() {
 		
 	    List<Integer> lista = Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9);

 			
 			lista.stream()
 			.distinct()
 			.skip(4)
 			.forEach(e -> System.out.println(e));
 			
 		}
     
     
     public void ListaMultiplicacao() {
    	 
    	 List<Integer> lista = Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9);

			
			lista.stream()
			.map(e -> e * 4)
			.forEach(e -> System.out.println(e));
			
    	 
    	 
     }
	
	
	
	
	
	
}
