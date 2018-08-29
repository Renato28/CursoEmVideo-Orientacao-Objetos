package nonaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Funcionario extends Pessoa{

	// atributos
	
	private String setor;
	private boolean trabalhando;
	
	//codigo comentado
	
	/*public Funcionario(String nome, int idade, String sexo) {
		
		super(nome, idade, sexo);
		
	}*/


	// metodos

	public void mudarTrabalho() {
		
		this.trabalhando = ! this.trabalhando;
	}

	// metodos getters e setters

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

	
}
