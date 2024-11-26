package abstrato;

public class JogoTabuleiro extends Jogo {
	String tipoPecas;

	public JogoTabuleiro(String nome, int nJogadores, String tipoPecas) {
		super(nome, nJogadores);
		this.tipoPecas = tipoPecas;
	}
	
	public void iniciar() {
		System.out.println("Jogo de Cartas: " + super.nome);
	}
	
	public void regras() {
		System.out.println("Um jogador começa e vai alternando em turnos a vez de cada jogador");
	}
}
