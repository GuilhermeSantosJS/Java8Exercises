package Ex2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListaString {

	public void ListaConcatenaStringP() {
		
	  List<String> list = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");
		
	  Optional<String> reduce = list.stream()
			  .filter(name -> name.startsWith("P"))
			  .reduce((n1, n2) -> n1.concat(n2));
	  
	  System.out.println(reduce);
	}
	
	public void ListaConcatenaStringA() {
		
		  List<String> list = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");
			
		  Optional<String> reduce = list.stream()
				  .filter(name -> name.startsWith("A"))
				  .reduce((n1, n2) -> n1.concat(n2));
		  
		  System.out.println(reduce);
		}
	
	public void ListaConcatenaStringTodos() {
		
		  List<String> list = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");
			
		  Optional<String> reduce = list.stream()
				  .filter(name -> name.startsWith(""))
				  .reduce((n1, n2) -> n1.concat(n2));
		  
		  System.out.println(reduce);
		}
	
	
	
}
