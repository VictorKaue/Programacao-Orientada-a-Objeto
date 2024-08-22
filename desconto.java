// Desenvolva um algoritmo que leia o valor de um produto e aplique um desconto a ser 
//especificado pelo usuário. Ao final do programa, apresente o nome do produto, seu 
//antigo valor e o valor com desconto aplicado com três casas decimais

package pacote;
import java.util.Scanner;

public class Desconto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do produto: ");
		float valor = sc.nextFloat();
		System.out.print("Digite quanto vale o desconto: ");
		float desconto = sc.nextFloat()/100;
		float valorfinal = valor-(valor*desconto);
		System.out.printf("valor antes do desconto: %.3f\nValor final: %.3f", valor, valorfinal);
		
		sc.close();
	}

}
