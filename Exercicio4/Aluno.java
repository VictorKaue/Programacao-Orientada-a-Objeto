package exercicio4;


/*Faça um programa para ler o nome de um aluno e as três notas que ele obteve nos 
três trimestres do ano:
• Primeiro trimestre vale 30 pontos;
• Segundo e terceiro trimestre valem 35 pontos cada.
Apresente a nota final, considerando o somatório dos três trimestres. O programa deve 
realizar as seguintes validações:
• Se o usuário digitar uma nota fora do intervalo de cada trimestre, o programa 
deverá solicitar a digitação novamente, até que o usuário informe a nota dentro 
do intervalo correto. Utilize a estrutura de repetição (while).
• Após o somatório das notas, informe se o aluno está aprovado (maior ou igual a 
70) ou reprovado (menor que 70). Em caso de reprovação, informe quantos 
pontos faltam para ele obter o mínimo para ser aprovado*/


public class Aluno {
	String nome;
	double[] nota = new double[3];
	double media;
	int i = 0;
	public void verificar_nota() {
		if(nota[0] > 0 || nota[0] < 30 | nota[1] > 0 || nota[1] < 35 || nota[2] > 0 || nota[2] < 35) {
			i++;
		}else{
			System.out.println("Valor inválido! Digite o número corretamente.");
		}
	}
	
	public void calcular_media() {
		media = (nota[0] + nota[1] + nota[2])/3;
	}
	public void verificar_media() {
		if(media > 7) {
			System.out.printf("O aluno está aprovado com a media de: %.2f\n",media);
		} else {
			System.out.printf("O aluno reprovou com a media de: %.2f\n", media);
			System.out.printf("Faltam %.2f para alcançar a media.\n", 7-media);
		}
	}
}
