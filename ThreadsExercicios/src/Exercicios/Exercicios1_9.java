package Exercicios;

public class Exercicios1_9 {

	/*1. Assinale a alternava que corresponde ao código correto para deixar uma thread dormir por
	5 segundos.
	A) Thread.sleep(5);
	B) thread.wait(5000);
	C) thread.sleep(5);
	D) Thread.sleep(5000);*/
	
	//Resposta = D
	
	
	/*2. Analise o código a seguir:
		TarefaMulplicacao tarefa = new TarefaMulplicacao(...);
		Thread threadMulplicador = new Thread(tarefa);
		Sobre a tarefa que a thread recebe, selecione a alternava correta.
		A) É um Runnable.
		B) É uma classe qualquer.
		C) A tarefa deve ter o método main.
		D) É um Comparable.*/
	
	//Resposta = A
	
	/*3. Em relação a um programa com várias Threads, marque a alternava correta sobre a ordem
	de execução.
	A) A ordem de execução será diferente em máquinas diferentes, mas na mesma máquina será
	sempre a mesma.
	B) Não é possível determinar a ordem de execução, que pode ser sempre diferente inclusive na
	mesma máquina.
	C) A ordem de execução será a mesma somente para máquinas com mesmo sistema
	operacional.
	D) A ordem de execução pode ser determinada, mas isso depende da implementação da
	máquina virtual.*/

	//Resposta = B
	
	
	/*4. Considere que um programa que crie e chame o método start() em três threads que
	respecvamente imprimem os valores 1, 2 e 3. Qual a ordem que esses valores serão
	impressos?
	A) 3,2,1
	B) Nada será impresso.
	C) 1, 2, 3
	D) Não é possível determinar a ordem.*/
	
	//Resposta = D
	
	
	/*5. Assinale a alternava que apresenta a maneira correta de pegar a instância da Thread atual
	(aquela que está sendo executada).
	A) Thread atual = Object.currentThread();
	B) Thread atual = Thread.getThread();
	C) Thread atual = (Thread) this;
	D) Thread atual = Thread.currentThread();*/
	
	//Resposta = D
	
	/*6. Qual o nome do bloco ou modificador que deve ser colocado em um método para que não
	possa ser executado por duas Threads ao mesmo tempo? Selecione a alternava correta.
	A) stac
	B) stricp
	C) synchronized
	D) final*/
	//Resposta = A
	
	/*7. Assinale a alternava que apresenta o significado de operação atômica.
	A) Cuja execução não pode ser interrompida na metade.
	B) Que está associada a apenas uma Thread
	C) Cuja execução é feita na memória principal sem o uso de cache.
	D) Cuja execução por várias Threads é alternada.*/

  //Resposta = A
	
	
	/*8. assinale a alternava que faz uso correto da palavra chave synchronized:
		A) public void metodo() {
		}
		B) public void metodo() {
		synchronized(this){
		}
		}
		C) public class TarefaBuscaNome {
		public synchronized TarefaBuscaNome() {
		}
		}
		D) public class TarefaBuscaNome {
		public synchronized String nome;
		}*/
	
	//Resposta = B
	
	
	/*9. Assinale a alternava que representa a maneira correta de fazer com que uma thread A
	espere a execução da thread B.
	A) Coloque um wait() na Thread B.
	B) Coloque um wait() na Thread A e um nofy() na Thread B.
	C) Coloque o modificador synchronized na thread B.
	D) Coloque um nofy() na Thread A*/
	
	//Resposta = B
	
		
	
	
	
	
	
	
	
	
	
	
	
}
