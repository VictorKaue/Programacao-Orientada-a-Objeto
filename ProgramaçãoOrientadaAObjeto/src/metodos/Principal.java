package metodos;

public class Principal {
	public static void main(String[] args) {
		Jogo jogo = new Jogo("F1", 200, "Xbox");
		
		
		jogo.setNome("Fifa");
		
		
		System.out.println(jogo.getNome());
	}
}
