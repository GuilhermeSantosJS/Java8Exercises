package Exercicio2;

import java.util.Optional;

public class Ex2 {

	
	public static void main(String[] args) {
		String x = " ";
		String z = "Streams";
		
		String number = convert(x)
				.orElseThrow(() -> new NullPointerException());
		System.out.println(number);
		
		String num = convert(z)
				.orElseThrow(() -> new NullPointerException());
		System.out.println(num);
		
		
		
		
	}
	
public static Optional<String> convert(String str){
		
		try {
			String intg  = String.valueOf(str);
			return Optional.of(intg);
		} catch (Exception e) {
			return Optional.empty();
		}	
		
		
		}
	
}
