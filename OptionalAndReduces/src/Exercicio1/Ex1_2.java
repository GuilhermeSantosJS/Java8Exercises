package Exercicio1;

import java.util.Optional;

public class Ex1_2 {
	
	public static void main(String[] args) {
		
String s = "Java";
String st = "";
		
		String num = number(s).orElse("Java");
		System.out.println(num);
		
		String n = number(s).orElseGet(() -> "Java");
		System.out.println(n);
		
		
		String a = number(st).orElse("");
		System.out.println(a);
		
		String b = number(st).orElseGet(() -> "");
		System.out.println(b);
		
		
		
	}
	
	public static Optional<String> number(String str){
		
		try {
			String intg  = String.valueOf(str);
			return Optional.of(intg);
		} catch (Exception e) {
			return Optional.empty();
		}	
		
		
		}
}
