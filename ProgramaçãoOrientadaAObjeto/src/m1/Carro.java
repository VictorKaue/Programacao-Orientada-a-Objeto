package m1;

public class Carro {
	public String modelo;
	private double preco;
	double quilometragem;
	public Carro(String modelo, double preco, double quilometragem) {
		this.modelo = modelo;
		this.preco = preco;
		this.quilometragem = quilometragem;
	}
	
	public void exibir() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Preço: " + preco);
		System.out.println("Quilometragem: " + quilometragem);
	}
	
}
