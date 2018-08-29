package nonaaula;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//codigo comentado
		
		/*Pessoa p1 = new Pessoa("Renato", 30, "M");
		Aluno p2 = new Aluno("Andriel", 14, "M");
		Professor p3 = new Professor("Rodrigo", 35, "M");
		Funcionario p4 = new Funcionario("Maria", 32, "F");*/
		
		//instanciando classes e criando objetos
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		//exectando os metodos das classes
		
		p1.fazerAniversario();
		p2.cancelarMatricula();
		p3.receberAumento(100);
		p4.mudarTrabalho();
	}

}
