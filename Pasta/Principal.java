package dados_funcionarios;
import java.util.Scanner;

public class Principal {
	Scanner sc = new Scanner(System.in);
	Funcionario funcionario = new Funcionario();
	funcionario.nome = sc.next();
	
	sc.close();
}
