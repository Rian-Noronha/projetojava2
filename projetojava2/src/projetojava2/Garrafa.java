package projetojava2;

public class Garrafa {
	
	private String cor;
	private String volume;
	private String nome;
	private double preco;
	private String corTampa;
	
	public Garrafa(String cor, String volume, String nome, double preco, String corTampa) {
		super();
		this.cor = cor;
		this.volume = volume;
		this.nome = nome;
		this.preco = preco;
		this.corTampa = corTampa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getCorTampa() {
		return this.corTampa;
	}
	
	public void setCorTampa(String corTampa) {
		this.corTampa = corTampa;
	}
	
	
	
	
	
	

}
