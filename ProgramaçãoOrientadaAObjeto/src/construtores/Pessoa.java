package construtores;

public class Pessoa {
	//atributos
	String nome;
	int idade;
	String time;
	
	//construtores
	public Pessoa() {
		System.out.println("Construtor");
	}
	
	public Pessoa(String nome, int idade, String time) {
		this.nome = nome;
		this.idade = idade;
		this.time = time;
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	//metodos
	public void exibirInformacoes() {
		System.out.println("Nome: "+ nome);
		System.out.println("Idade: "+ idade);
		System.out.println("Time: "+ time);
	}
	
}
