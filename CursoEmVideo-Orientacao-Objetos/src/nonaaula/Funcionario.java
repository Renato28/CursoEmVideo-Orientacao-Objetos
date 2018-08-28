package nonaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Funcionario {
	
	//atributos
	
	private String setor;
	private boolean trabalhando;
	
	//metodo construtor
	
	public Funcionario(String setor) {

		this.setor = setor;
		this.trabalhando = false;
	}
	
	//metodos
	
	public void mudarTrabalho() {

	}
	
	//metodos getters e setters
	
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
