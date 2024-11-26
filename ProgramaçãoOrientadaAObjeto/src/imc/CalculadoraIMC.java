package imc;

public class CalculadoraIMC {
	// atributos
	double altura;
	double peso;
	
	//métodos
	//calcular IMC
	public double calculoIMC(){
		return peso/(altura*altura);		
	}
	//interpretar
	public String interpretarIMC(double imc) {
		if(imc < 18.5) {
			return "Abaixo do peso";
		} else if(imc < 25) {
			return "Peso normal";
		} else{
			return "obesidade";
		}
	}
}
