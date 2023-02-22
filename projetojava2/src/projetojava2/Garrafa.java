package projetojava2;

public class Garrafa {
	
	private String cor;
	private String volume;
	private String nome;
	private double preco;
	public Garrafa(String cor, String volume, String nome, double preco) {
		super();
		this.cor = cor;
		this.volume = volume;
		this.nome = nome;
		this.preco = preco;
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
	
	
	
	
	

}
