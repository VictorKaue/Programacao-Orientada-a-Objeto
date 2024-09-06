package exercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		do {
			System.out.printf("Digite a %d nota: ", aluno.i+1);
			aluno.nota[aluno.i] = sc.nextDouble();
			aluno.verificar_nota();
		}while(aluno.i <= 2);
		aluno.calcular_media();
		aluno.verificar_media();
		sc.close();
	}
}
