package colecoes;
import java.util.ArrayList;

public class ExemploArrayList {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Arnaldinho Do fut");
		nomes.add("Bob Exponjia");
		System.out.println("Nomes: " + nomes);
		System.out.println("Tamanho: " + nomes.size());
		nomes.remove("bob");
		System.out.println("Nomes: " + nomes);
		if(nomes.contains("Bob Exponjia")) {
			System.out.println("Certo");
		} else {
			System.err.println("Error!");
		}
	System.out.println("Lista vazia: " + nomes.isEmpty());
	}
}
