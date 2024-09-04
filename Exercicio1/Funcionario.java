package dados_funcionarios;

public class Funcionario {
	String nome;
	float salario;
	
	public float reajuste(float salario_novo) {
		if(salario > 0 && salario <=1000) {
			salario_novo += salario*(15/100);
		} else if(salario > 1000 && salario <=1500) {
			salario_novo += salario*(10/100);
		} else {
			salario_novo += salario*(5/100);
		}
		return salario_novo;
	}
}
