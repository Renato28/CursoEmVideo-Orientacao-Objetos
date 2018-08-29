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
		
		//definindo os valores dos atributos das classes
		
		p1.setNome("Renato");
		p1.setIdade(30);
		p1.setSexo("M");
		
		p2.setNome("Andriel");
		p2.setIdade(14);
		p2.setSexo("M");
		
		p3.setNome("Rodrigo");
		p3.setIdade(32);
		p3.setSexo("M");
		
		p4.setNome("Maria");
		p4.setIdade(28);
		p4.setSexo("F");
		
		//executando o metodo toString da classe Pessoa com o conceito de heranca
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		//exectando os metodos das classes
		
		p1.fazerAniversario();
		p2.cancelarMatricula();
		p3.receberAumento(100);
		p4.mudarTrabalho();
	}

}
