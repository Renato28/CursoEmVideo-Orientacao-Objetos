package nonaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//criando um objeto da classe Pessoa e atribuindo valores aos seus atributos
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Renato");
		pessoa.setIdade(30);
		pessoa.setSexo("M");
		
		//executando o metodo da classe Pessoa
				
		pessoa.fazerAniversario();
		
		//executando os valores dos atributos e metodos da classe Pessoa
		
		System.out.println(pessoa);
		
		//criando um objeto da classe Aluno e atribuindo valores aos seus atributos
		
		Aluno aluno = new Aluno();
		aluno.setNome("Andriel");
		aluno.setIdade(14);
		aluno.setSexo("M");
		aluno.setMatricula(123);
		aluno.setCurso("Inglês");
		
		//executando os metodos da classe Aluno
		
		aluno.cancelarMatricula();
		aluno.fazerAniversario();
		
		//executando os valores dos atributos e metodos da classe Aluno
		
		System.out.println(aluno);
		
		//criando um objeto da classe Funcionario e atribuindo valores aos seus atributos
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Maria");
		funcionario.setIdade(28);
		funcionario.setSexo("F");
		funcionario.setSetor("Secretaria");
		funcionario.setTrabalhando(true);
		
		//executando os metodos da classe Funcionario
		
		funcionario.fazerAniversario();
		funcionario.mudarTrabalho();
		
		//executando os valores dos atributos e metodos da classe Funcionario
		
		System.out.println(funcionario);
		
		//criando um objeto da classe Professor e atribuindo valores aos seus atributos
		
		Professor professor = new Professor();
		professor.setNome("Rodrigo");
		professor.setIdade(32);
		professor.setSexo("M");
		professor.setEspecialidade("Java");
		professor.setSalario(2500);
		
		//executando os metodos da classe Professor
		
		professor.fazerAniversario();
		professor.receberAumento(200);
		
		//executando os valores dos atributos e metodos da classe Professor
		
		System.out.println(professor);
		
	}

}
