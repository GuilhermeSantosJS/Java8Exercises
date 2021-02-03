package Exercicio13_14;

import java.util.Scanner;



public class CaixaEletronico implements Runnable {

	private int transf, saldo, pagamento;
	Scanner sys = new Scanner(System.in);
	private final Integer[] notas = new Integer[] { 100, 50, 20, 10, 5, 2 };
	private int saque = 0;
	private int aux;
	
	@Override
	public void run() {
		
		int opcao = 0;
		do {
			
			
			
			System.out.println("----------------CAIXA ELETRONICO---------------");
			System.out.println("1 - SALDO");
			System.out.println("2 - SAQUE");
			System.out.println("3 - TRANSFERENCIA");
			
			System.out.println("Digite uma opção:");
			opcao = sys.nextInt();
			
			System.out.print("\n");
			
			switch (opcao) {
			case 1:
				
				System.out.println("Informe seu ultimo pagamento:");
				pagamento = sys.nextInt();
				
				pagamento = pagamento + aux;
				
				if(pagamento <= 0) {
				System.err.println("Valor do pagamento não pode ser menor ou igual a 0");
				}else {
				saldo = pagamento;
				System.out.println("Saldo da conta:" + saldo);
				}
				break;
				
			case 2:
				if(saldo <= 0) {
					System.err.println("Saldo não pode ser igual ou menor que 0");
				}
				
				for (Integer integer : notas) {
				System.out.println("Notas disponiveis para saque:" + integer);
				
				}
				
				
				
				System.out.println("Quanto deseja sacar:");
				
				saque = sys.nextInt();
				
				Thread t = new Thread();
				try {
					
					System.out.println("Realizando saque aguarde ....");
					Thread.sleep(8000);
					
					 if(saque > saldo) {
							System.err.println("Voce esta tentando sacar um valor maior que o seu saldo!");
						}
						else if (saque <= 0) {
						System.err.println("Saque não pode ser menor que o seu saldo");	
						}else {
							saldo = saldo - saque;
							System.out.println("saque realizado com sucesso!");
							System.out.println("O seu novo saldo é:" + saldo);
							 aux = saldo;
						}
					
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				 t.start();
				 
			
				
				break;
	                  
			case 3:
                if(saldo <= 0) {
                	System.err.println("Saldo não pode ser igual ou menor que 0");
                	System.out.close();
                	
                } else {	
                
                for (Integer integer : notas) {
    				System.out.println("Notas disponiveis para transferencia:" + integer);
    				
    				}
                
                System.out.println("Saldo atual:" + saldo);
                
        
				System.out.println("Quanto deseja transferir:");
				transf = sys.nextInt();
				
				
				Thread t2 = new Thread();
				try {
					System.out.println("Realizando transferencia aguarde ....");
					Thread.sleep(5000);
					
					if(transf > saldo) {
						System.err.println("Voce esta tentando transferir um valor maior que o seu saldo!");
					}
					else if (transf <= 0) {
					System.err.println("Transferencia não pode ser menor que o seu saldo");	
					}else {
						saldo = saldo - transf;
						System.out.println("Tranferencia realizada com sucesso!");
						System.out.println("O seu novo saldo é:" + saldo);
						 aux = saldo;
					}
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
                
				 t2.start();
					
                }
				break;
			case 0:
				System.out.println("Saindo do caixa eletronico....");
				System.out.close();
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0 );
	}
		
	
	
	public Integer[] getNotas() {
		return notas;
	}


	public int getSaque() {
		return saque;
	}

	public void setSaque(int saque) {
		this.saque = saque;
	}



	public int getTransf() {
		return transf;
	}



	public void setTransf(int transf) {
		this.transf = transf;
	}
	
	
	
	
	
		

}
	
	

