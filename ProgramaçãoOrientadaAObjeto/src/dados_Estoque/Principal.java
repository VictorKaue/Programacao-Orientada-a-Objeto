package dados_Estoque;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Estoque estoque = new Estoque();
		System.out.println("Digite o nome do produto: ");
		estoque.nome = sc.next();
		System.out.println("Digite o preço do produto: ");
		estoque.preco = sc.nextFloat();
		System.out.println("Digite a quantidade em estoque: ");
		estoque.quantidade = sc.nextInt();
		float valor_total = estoque.Valor_total();
		estoque.imprimir_atributos(valor_total);
		System.out.println("Digite a quantidade para adicionar: ");
		estoque.entrada(sc.nextInt());
		valor_total = estoque.Valor_total();
		estoque.imprimir_atributos(valor_total);
		System.out.println("Digite a quantidade que deseja retirar: ");
		valor_total = estoque.Valor_total();
		estoque.saida(sc.nextInt());
		estoque.imprimir_atributos(valor_total);
		
		sc.close();
	}
}
