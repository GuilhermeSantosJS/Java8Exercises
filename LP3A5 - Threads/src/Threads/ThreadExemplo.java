package Threads;

public class ThreadExemplo implements Runnable {

	private String nome;
	private long tempo;
	
	public ThreadExemplo(String nome, long tempo) {
		
		this.nome = nome;
		this.tempo  = tempo;
		
		Thread t = new Thread(this);
		t.start();
		
	}
	
	@Override
	public void run() {
		
		try {
		for(int i = 0; i < 6; i++) {
			
			System.out.println(nome + " contagem -> " + i);
			Thread.sleep(tempo);
		}	
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(nome + " terminou a execução ");
	}
	
	
	
	
	
	
	
	
	
}
