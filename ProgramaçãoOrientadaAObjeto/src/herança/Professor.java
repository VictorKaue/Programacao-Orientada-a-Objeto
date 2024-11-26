package herança;

public class Professor extends Pessoa {
	
	private String disciplina;
	private double salario;
	public Professor(String nome, int idade, String disciplina, double salario) {
		super(nome, idade);
		this.disciplina = disciplina;
		this.salario = salario;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}	
	//metodo sobrescrito

	@Override
	public void apresentar() {
		super.apresentar();
		System.out.println("Disciplina: " + disciplina);
	}
	
}
