package herança;

public class Principal {
	
	public static void main(String[] args) {
		Professor professor = new Professor("Nome", 18, "Disciplina", 1990.99);
		Aluno aluno = new Aluno("Aluno", 80, "Curso");
		Pessoa pessoa = new Pessoa("Ana" , 25);
		
		
		professor.apresentar();
		aluno.apresentar();
		
		System.out.println(pessoa);
		System.out.println(aluno);
		
	}
}
