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
		aluno.setCurso("Inglês");
		
		System.out.println(aluno);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Maria");
		funcionario.setIdade(28);
		funcionario.setSexo("F");
		funcionario.setSetor("Secretaria");
		funcionario.setTrabalhando(true);
		
		System.out.println(funcionario);
	}

}
