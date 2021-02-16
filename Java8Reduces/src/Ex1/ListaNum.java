package Ex1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListaNum {

	public void ListaSomaNumeros() {
		
		for (int i = 0; i < 100; i++) {
	         int numAleatorio = (int)(Math.random() * 100 ) + 1;
	         
	         List<Integer> lista = Arrays.asList(numAleatorio);
	               
	 		Integer reduce =  lista.stream()
	 			       .reduce(numAleatorio, (a, b) ->  numAleatorio + numAleatorio);
	 			       
	 			       System.out.println(reduce);
		}  
	}

	public void ListaMultiplicaNumeros() {
		

		for (int i = 0; i < 100; i++) {
	         int numAleatorio = (int)(Math.random() * 100 ) + 1;
	         
	         List<Integer> lista = Arrays.asList(numAleatorio);
	               
	 		Integer reduce =  lista.stream()
	 			       .reduce(numAleatorio, (a, b) ->  numAleatorio * numAleatorio);
	 			       
	 			       System.out.println(reduce);
	         
		}
	}

	public void ListaMenorNumero() {
		
		int menor = Integer.MAX_VALUE;
		int indiceMenor = -1; 
		int fim = 100;
		
	            		
		for (int i = 0; i < fim; i++) {
	         int numAleatorio = (int)(Math.random() * fim ) + 1;
	         
	         List<Integer> lista = Arrays.asList(numAleatorio);
	               
	         
	         if(fim < menor) {
	 		Integer reduce =  lista.stream()
	 			       .reduce(indiceMenor, (a, b) ->  numAleatorio + numAleatorio) ;
	
	 		 menor = fim;
             indiceMenor = i;
	 		
     System.out.println("Lista: " + reduce);
     		    
	         }
	}
		

	}
	
	public void ListaMaiorNumero() {
		
		int maior = Integer.MIN_VALUE;
		int indiceMaior = -1; 
		int fim = 100;
		
		for (int i = 0; i < fim; i++) {
	         int numAleatorio = (int)(Math.random() * fim ) + 1;
	         
	         List<Integer> lista = Arrays.asList(numAleatorio);
	               
	         if (fim > maior) {
	 		Integer reduce =  lista.stream()
  .reduce(indiceMaior, (a, b) ->  numAleatorio + numAleatorio);	

	 		 maior = fim;
             indiceMaior = i;
             
             System.out.println("Lista: " + reduce);
	         
             
             
	         }  
         
		}
	
	
	}
	
	
}
