package veículo;

public class Principal {
	public static void main(String[] args) {
		Carro meuCarro = new Carro(); //objeto
		Carro meuCarro2 = new Carro();

		meuCarro.modelo = "UNO";
		meuCarro.cor = "Rosa";
		meuCarro.ano = 1480;
		meuCarro.placa = "BBB0-F209";
		
		meuCarro2.ano = 2039;
		meuCarro2.modelo = "Delorian";
		meuCarro2.cor = "Transparente";
		meuCarro2.placa = "AAA0-F209";
		
		meuCarro.exibirInformacoes();
		meuCarro2.exibirInformacoes();
		
		
	}
}
