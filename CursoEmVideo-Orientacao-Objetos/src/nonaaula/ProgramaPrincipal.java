package nonaaula;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Renato");
		pessoa.setIdade(30);
		pessoa.setSexo("M");
		
		System.out.println(pessoa);
	}

}
