package exercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangulo triangulo1 = new Triangulo();
		Triangulo triangulo2 = new Triangulo();
		System.out.println("Triângulo 1");
		System.out.print("Digite o tamanho do lado A: ");
		triangulo1.ladoA = sc.nextDouble();
		System.out.print("Digite o tamanho do lado B: ");
		triangulo1.ladoB = sc.nextDouble();
		System.out.print("Digite o tamanho do lado C: ");
		triangulo1.ladoC = sc.nextDouble();
		System.out.println("Triângulo 2");
		System.out.print("Digite o tamanho do lado A: ");
		triangulo2.ladoA = sc.nextDouble();
		System.out.print("Digite o tamanho do lado B: ");
		triangulo2.ladoB = sc.nextDouble();
		System.out.print("Digite o tamanho do lado C: ");
		triangulo2.ladoC = sc.nextDouble();
		
		triangulo1.area = triangulo1.Area();
		triangulo2.area = triangulo2.Area();
		
		triangulo1.verificar(triangulo2.area);
		sc.close();
	}

}
