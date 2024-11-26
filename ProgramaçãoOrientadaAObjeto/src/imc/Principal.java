package imc;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculadoraIMC calc = new CalculadoraIMC();
		System.out.println("Digite seu peso: ");
		calc.peso = sc.nextDouble();
		System.out.println("Digite sua altura");
		calc.altura = sc.nextDouble();
		System.out.println("IMC: " + calc.calculoIMC());
		System.out.println(calc.interpretarIMC(calc.calculoIMC()));

		sc.close();
	}

}
