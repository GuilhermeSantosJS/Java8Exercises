package Ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class TesteOptional {

	public static void main(String[] args) throws Exception {
		
		List<String> str =  Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara" , "Pedro", "Alfredo");
		
		/*Optional<String> s = str.stream()
		 .filter(e -> e.startsWith("W"))
	    .findAny();
	
		
	System.out.println("Nome com esta letra não consta na lista: " + s.isPresent());*/
		
		
		Optional<String> s = str.stream()
				.filter(e -> e.startsWith("W"))
		        .findAny();
		
		s.orElseThrow(() -> new Exception("Nome com esta letra nao consta na lista"));
			
		
	   

		

		
	}
	

	
	
	
}
