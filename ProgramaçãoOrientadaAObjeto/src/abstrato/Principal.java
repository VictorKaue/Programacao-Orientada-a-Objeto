package abstrato;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jogo jogo1 = new JogoCartas("Uno", 4, "Padrão");
		Jogo jogo2 = new JogoTabuleiro("Xadrez", 2, "Plástico");
		jogo1.iniciar();
		jogo1.regras();
		jogo2.iniciar();
		jogo2.regras();
		
	}
}
