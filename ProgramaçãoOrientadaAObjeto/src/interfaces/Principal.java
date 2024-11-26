package interfaces;

public class Principal {
	public static void main(String[] args){
		RadioRelogio r = new RadioRelogio();
		r.ligar();
		
		System.out.println("Hora: " + r.horas());
		
		r.estacao(106.3);
		System.out.println(r.estacaoAtual);
		r.desligar();
	}
}
