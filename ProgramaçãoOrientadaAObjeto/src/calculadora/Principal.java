package calculadora;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Num 1: ");
		calc.num1 = scan.nextDouble();
		System.out.println("Num 2: ");
		calc.num2 = scan.nextDouble();
		
		System.out.println("Soma: " + calc.somar());
		System.out.println("Subtração: " + calc.subtrair());
		
		scan.close();
	}
}
