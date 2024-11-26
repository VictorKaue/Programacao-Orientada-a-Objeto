package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
	public static void main(String[] args) {
		Set<String> frutas = new HashSet<>();
		frutas.add("Maçã");
		frutas.add("uva");
		frutas.add("Banana");
		frutas.add("uva");
		System.out.println(frutas.toString());	
	}
}