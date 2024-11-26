package colecoes;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

	public static void main(String[] args) {
		Map<String, Integer> idades = new HashMap<>();
		
		idades.put("algo", 10);
		idades.put("Bob", 20);
		System.out.println(idades.toString());
		idades.remove("Bob");
		System.out.println(idades.toString());
		
		if(idades.containsValue(10)) {
			System.out.println("Encontrado");
		}
	}
}
