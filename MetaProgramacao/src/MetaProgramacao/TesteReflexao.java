package MetaProgramacao;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteReflexao {

	public static void main(String[] args) throws ParseException, IllegalArgumentException, IllegalAccessException,
			ClassNotFoundException, InstantiationException, InvocationTargetException, NoSuchMethodException,
			SecurityException, NoSuchFieldException {

		/*
		 * CarroReflexao carroReflexao = new CarroReflexao();
		 * carroReflexao.setCodCarro(1); carroReflexao.setNomeCarro("GOL");
		 * carroReflexao.setMarcaCarro("WOLKSVAGEN");
		 * carroReflexao.setCorCarro("Vermelho"); carroReflexao.setPrecoCarro(30.000);
		 * DateFormat data = new SimpleDateFormat("dd/MM/yyyy"); Date novaData =
		 * data.parse("05/03/2008"); carroReflexao.setDataLancCarro(novaData);
		 * carroReflexao.ExibeDados();
		 * 
		 * Reflexao.refletirObjeto(carroReflexao, CarroReflexao.class);
		 */

		Class classeCarro = Class.forName("MetaProgramacao.CarroReflexao");
		Object meuObjeto = classeCarro.getConstructor().newInstance();

		Field field = meuObjeto.getClass().getDeclaredField("nomeCarro");
		field.setAccessible(true);
		field.set(meuObjeto, "GOL");
		
		field = meuObjeto.getClass().getDeclaredField("precoCarro");
		field.setAccessible(true);
		field.set(meuObjeto, 30.000);
	
		Reflexao.refletirObjeto(meuObjeto, meuObjeto.getClass());
		
		

	}

}
