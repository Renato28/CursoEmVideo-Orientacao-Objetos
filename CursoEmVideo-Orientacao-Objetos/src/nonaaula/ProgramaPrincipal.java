package nonaaula;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Renato");
		pessoa.setIdade(30);
		pessoa.setSexo("M");
		
		System.out.println(pessoa);
		
		Aluno aluno = new Aluno();
		aluno.setNome("Andriel");
		aluno.setIdade(14);
		aluno.setSexo("M");
		aluno.setMatricula(123);
		aluno.setCurso("Ingl�s");
		
		System.out.println(aluno);
	}

}
