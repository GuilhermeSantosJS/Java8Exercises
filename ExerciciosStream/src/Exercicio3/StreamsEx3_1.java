package Exercicio3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsEx3_1 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, 5, 6, 7, 8, 9, 4, 3, 5, 6);
		
	Optional<Integer> maiorNum = list.stream()		
			.max(Comparator.naturalOrder());
		System.out.println(maiorNum.get());
		
		
	}
	
	
}
