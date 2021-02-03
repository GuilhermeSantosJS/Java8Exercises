package Exercicios;

public class Exercicios1_9 {

	/*1. Assinale a alternava que corresponde ao c�digo correto para deixar uma thread dormir por
	5 segundos.
	A) Thread.sleep(5);
	B) thread.wait(5000);
	C) thread.sleep(5);
	D) Thread.sleep(5000);*/
	
	//Resposta = D
	
	
	/*2. Analise o c�digo a seguir:
		TarefaMulplicacao tarefa = new TarefaMulplicacao(...);
		Thread threadMulplicador = new Thread(tarefa);
		Sobre a tarefa que a thread recebe, selecione a alternava correta.
		A) � um Runnable.
		B) � uma classe qualquer.
		C) A tarefa deve ter o m�todo main.
		D) � um Comparable.*/
	
	//Resposta = A
	
	/*3. Em rela��o a um programa com v�rias Threads, marque a alternava correta sobre a ordem
	de execu��o.
	A) A ordem de execu��o ser� diferente em m�quinas diferentes, mas na mesma m�quina ser�
	sempre a mesma.
	B) N�o � poss�vel determinar a ordem de execu��o, que pode ser sempre diferente inclusive na
	mesma m�quina.
	C) A ordem de execu��o ser� a mesma somente para m�quinas com mesmo sistema
	operacional.
	D) A ordem de execu��o pode ser determinada, mas isso depende da implementa��o da
	m�quina virtual.*/

	//Resposta = B
	
	
	/*4. Considere que um programa que crie e chame o m�todo start() em tr�s threads que
	respecvamente imprimem os valores 1, 2 e 3. Qual a ordem que esses valores ser�o
	impressos?
	A) 3,2,1
	B) Nada ser� impresso.
	C) 1, 2, 3
	D) N�o � poss�vel determinar a ordem.*/
	
	//Resposta = D
	
	
	/*5. Assinale a alternava que apresenta a maneira correta de pegar a inst�ncia da Thread atual
	(aquela que est� sendo executada).
	A) Thread atual = Object.currentThread();
	B) Thread atual = Thread.getThread();
	C) Thread atual = (Thread) this;
	D) Thread atual = Thread.currentThread();*/
	
	//Resposta = D
	
	/*6. Qual o nome do bloco ou modificador que deve ser colocado em um m�todo para que n�o
	possa ser executado por duas Threads ao mesmo tempo? Selecione a alternava correta.
	A) stac
	B) stricp
	C) synchronized
	D) final*/
	//Resposta = A
	
	/*7. Assinale a alternava que apresenta o significado de opera��o at�mica.
	A) Cuja execu��o n�o pode ser interrompida na metade.
	B) Que est� associada a apenas uma Thread
	C) Cuja execu��o � feita na mem�ria principal sem o uso de cache.
	D) Cuja execu��o por v�rias Threads � alternada.*/

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
	espere a execu��o da thread B.
	A) Coloque um wait() na Thread B.
	B) Coloque um wait() na Thread A e um nofy() na Thread B.
	C) Coloque o modificador synchronized na thread B.
	D) Coloque um nofy() na Thread A*/
	
	//Resposta = B
	
		
	
	
	
	
	
	
	
	
	
	
	
}
