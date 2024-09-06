package exercicio3;
import java.math.*;

/*Crie um programa para ler as medidas dos lados de dois triângulos X e Y. Em seguida, 
//apresente o valor das áreas dos dois triângulos e informe qual dos triângulos possui a 
//maior área.
//A fórmula para calcular a área do triângulo a partir das medidas de seus lados "a", "b" e 
"c" é a seguinte (fórmula de Heron):*/

public class Triangulo {
	double ladoA;
	double ladoB;
	double ladoC;
	double area;
	
	
	public double Area() {
		double semip = (ladoA + ladoB + ladoC)/2;
		return  Math.sqrt(semip*(semip-ladoA)*(semip-ladoB)*(semip-ladoC));
	}
	
	public void verificar(double area2) {
		System.out.println("Área do triângulo 1: " + area);
		System.out.println("Área do triângulo 2: " + area2);
		if (area > area2) {
			System.out.println("Área do triângulo 1: " + area);
			System.out.println("Área do triângulo 2: " + area2);
			System.out.println("O primeiro triângulo tem a área maior");
		} else if(area < area2) {
			System.out.println("O segundo triângulo tem a área maior ");
		} else {
			System.out.println("Os dois têm a mesma área");
		}
	}
}
