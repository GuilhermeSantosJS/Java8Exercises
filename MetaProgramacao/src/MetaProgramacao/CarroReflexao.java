package MetaProgramacao;

import java.util.Date;

public class CarroReflexao {
	private int codCarro;
	private String marcaCarro;
	private String corCarro;
	private double precoCarro;
	private Date dataLancCarro;
	private String nomeCarro;

	public CarroReflexao(int codCarro, String marcaCarro, String corCarro, double precoCarro, Date dataLancCarro,
			String nomeCarro) {

		dataLancCarro = new Date();

		this.codCarro = codCarro;
		this.marcaCarro = marcaCarro;
		this.corCarro = corCarro;
		this.precoCarro = precoCarro;
		this.dataLancCarro = dataLancCarro;
		this.nomeCarro = nomeCarro;
	}

	public CarroReflexao() {

		dataLancCarro = new Date();

	}

	public int getCodCarro() {
		return codCarro;
	}

	public void setCodCarro(int codCarro) {
		this.codCarro = codCarro;
	}

	public String getMarcaCarro() {
		return marcaCarro;
	}

	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}

	public String getCorCarro() {
		return corCarro;
	}

	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}

	public double getPrecoCarro() {
		return precoCarro;
	}

	public void setPrecoCarro(double precoCarro) {
		this.precoCarro = precoCarro;
	}

	public Date getDataLancCarro() {
		return dataLancCarro;
	}

	public void setDataLancCarro(Date dataLancCarro) {
		this.dataLancCarro = dataLancCarro;
	}

	public String getNomeCarro() {
		return nomeCarro;
	}

	public void setNomeCarro(String nomeCarro) {
		this.nomeCarro = nomeCarro;
	}

	public void ExibeDados() {
		System.out.println(" ========================  IMPRESSÃO DOS DADOS =========================");
		System.out.println("Codigo do Carro: " + codCarro + "\n" + "Nome do Carro: " + nomeCarro + "\n"
				+ "Marca do Carro: " + marcaCarro + "\n" + "Cor do Carro: " + corCarro + "\n"
				+ "Data de lançamento do carro: " + dataLancCarro + "\n" + "Preco do carro: " + precoCarro);

	}

}
