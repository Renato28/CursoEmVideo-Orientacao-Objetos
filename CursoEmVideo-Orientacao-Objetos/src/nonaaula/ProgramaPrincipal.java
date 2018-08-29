package nonaaula;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Renato");
		pessoa.setIdade(30);
		pessoa.setSexo("M");
		pessoa.fazerAniversario();
		System.out.println(pessoa);
		
		Aluno aluno = new Aluno();
		aluno.setNome("Andriel");
		aluno.setIdade(14);
		aluno.setSexo("M");
		aluno.setMatricula(123);
		aluno.setCurso("Ingl�s");
		aluno.cancelarMatricula();
		System.out.println(aluno);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Maria");
		funcionario.setIdade(28);
		funcionario.setSexo("F");
		funcionario.setSetor("Secretaria");
		funcionario.setTrabalhando(true);
		funcionario.mudarTrabalho();
		System.out.println(funcionario);
		
		Professor professor = new Professor();
		professor.setNome("Rodrigo");
		professor.setIdade(32);
		professor.setSexo("M");
		professor.setEspecialidade("Java");
		professor.setSalario(2500);
		
		System.out.println(professor);
		
		pessoa.fazerAniversario();
		aluno.cancelarMatricula();
		funcionario.mudarTrabalho();
		professor.receberAumento(200);
	}

}
