package abstrato;

public class JogoCartas extends Jogo {
	String tipoBaralho;

	public JogoCartas(String nome, int nJogadores, String tipoBaralho) {
		super(nome, nJogadores);
		this.tipoBaralho = tipoBaralho;
	}
	
	public void iniciar() {
		System.out.println("Jogo de Cartas: " + super.nome);
	}
	
	public void regras() {
		System.out.println("Cada jogador deve jogar 1 carta por vez");
	}
	
}
