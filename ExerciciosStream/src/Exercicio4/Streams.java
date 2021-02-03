package Exercicio4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Streams {

	public void ListString() {
		List<String> listNomes = Arrays.asList("Paulo", "Camila", "Ana Maria" , "Patrick" ,"Ana Clara", "Pedro", "Alfredo");
		
		List<String> result = listNomes.stream()
				.filter(name -> name.startsWith("P"))
				.collect(Collectors.toList());

result.forEach(e -> System.out.println(e));
		
		
	}
	
	public void listTamanho() {
		List<String> listNomes = Arrays.asList("Paulo", "Camila", "Ana Maria" , "Patrick" ,"Ana Clara", "Pedro", "Alfredo");
		
		List<Integer> result = listNomes.stream()
				.map(e -> e.length())
				.collect(Collectors.toList());
                result.forEach(e -> System.out.println(e));
		
		
	}
	
	public void listAgrupa() {
		List<String> listNomes = Arrays.asList("Paulo", "Camila", "Ana Maria" , "Patrick" ,"Ana Clara", "Pedro", "Alfredo");
		
	
		String str = listNomes.stream()
				.filter(e -> e.startsWith("A"))
		        .collect(Collectors.joining()); 
		System.out.println(str);
		
	}
	
	
	public void listAgrupaVirgula() {
			
     List<String> listNomes = Arrays.asList("Paulo", "Camila", "Ana Maria" , "Patrick" ,"Ana Clara", "Pedro", "Alfredo");
		
     String str = listNomes.stream()
    		 .map(e -> e.toUpperCase())
    		 .sorted()
    		 .collect(Collectors.joining(";"));
    		 
             
    		 
     System.out.println(str);
	}

	
	
	
	
	
	
	
}
