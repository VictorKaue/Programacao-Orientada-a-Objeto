package abstrato;

public abstract class Jogo {
	String nome;
	int nJogadores;
	
	public Jogo(String nome, int nJogadores) {
		this.nome = nome;
		this.nJogadores = nJogadores;
	}
	
	//método: abstrato
	public abstract void iniciar();
	public abstract void regras();	
	//método: concreto
	public String toString() {
		return "Nome: " + nome +
				"Jogadores: " + nJogadores;
	}
}
