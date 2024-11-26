package metodos;

public class Jogo {
	//atributos privados
	private String nome;
	private double preco;
	private String plataforma;
	public Jogo(String nome, double preco, String plataforma) {
		this.nome = nome;
		this.preco = preco;
		this.plataforma = plataforma;
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
		if(preco >= 0) {
			this.preco = preco;
		} else {
			System.out.println("Preço inválido");
		}
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
}
