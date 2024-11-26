package dados_Estoque;

public class Estoque {
	String nome;
	float preco;
	int quantidade;
	
	
	public float Valor_total(){
		return preco*quantidade;
	}
	
	public void entrada(int quanti) {
		quantidade += quanti;
	}
	
	public void saida(int quanti) {
		if(quanti > quantidade) {
			System.out.println("Quantidade maior do que a quantidade em estoque!");
		} else {
			quantidade -= quanti;
		}
	}
	
	public void imprimir_atributos(float valor_total) {
		System.out.println("Produto: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Valor total:" + valor_total);
	}
}
