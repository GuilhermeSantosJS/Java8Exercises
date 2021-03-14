package Exercicio1;


public class TratandoExcecoes {
     private int x, y, result;
	
	public void TesteExcecaoNegativa() {
		
        if(x < 0) {
         System.out.println("Erro Argumento negativo");
        }else if(x <= 10000) {
        	System.out.println("Erro argumento deve ser maior que X");
        } else if (x > 1000) {
        	System.out.println("Erro argumento muito grande");
        }
		
	}
	
	public void TesteDivisaoPorZero() {
		result = x / y;
		if(result < 0) {
		System.out.println("Erro a divisão não pode ser negativa");
		}
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	
	
	
	
}
