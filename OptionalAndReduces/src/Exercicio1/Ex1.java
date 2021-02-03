package Exercicio1;

import java.util.Optional;

public class Ex1 {

	
	public static void main(String[] args) {
		
		
	String s = "";
		
		Integer num = number(s).orElse(1);
		System.out.println(num);
		
		Integer n = number(s).orElseGet(() -> 1);
		System.out.println(n);
		
	}
	
	public static Optional<Integer> number(String str){
		
	try {
		Integer intg  = Integer.valueOf(str);
		return Optional.of(intg);
	} catch (Exception e) {
		return Optional.empty();
	}	
	
	
	}
}
