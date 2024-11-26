package veículo;

public class Carro {
	//Classe
	//Atributos (características)
	
	String modelo;
	String cor;
	int ano;
	String placa;
	
	public void exibirInformacoes() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("ano: " + ano);
		System.out.println("placa: " + placa);
	}
}
