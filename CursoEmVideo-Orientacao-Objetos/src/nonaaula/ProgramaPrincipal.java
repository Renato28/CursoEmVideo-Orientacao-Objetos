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
		aluno.setCurso("Inglês");
		aluno.cancelarMatricula();
		aluno.fazerAniversario();
		System.out.println(aluno);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Maria");
		funcionario.setIdade(28);
		funcionario.setSexo("F");
		funcionario.setSetor("Secretaria");
		funcionario.setTrabalhando(true);
		funcionario.fazerAniversario();
		funcionario.mudarTrabalho();
		System.out.println(funcionario);
		
		Professor professor = new Professor();
		professor.setNome("Rodrigo");
		professor.setIdade(32);
		professor.setSexo("M");
		professor.setEspecialidade("Java");
		professor.setSalario(2500);
		professor.fazerAniversario();
		professor.receberAumento(200);
		System.out.println(professor);
		
	}

}
