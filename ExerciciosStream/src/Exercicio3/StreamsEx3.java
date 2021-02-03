package Exercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsEx3 {

	public static void main(String[] args) {
		
		
		List<Integer> range = IntStream.range(0, 100).boxed()
		.collect(Collectors.toCollection(ArrayList::new));
		Collections.shuffle(range);
		range.subList(0, 100)
		.forEach(System.out::println);
		
			
		}
			
		

	
}
