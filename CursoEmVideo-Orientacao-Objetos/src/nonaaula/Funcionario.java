package nonaaula;

public class Funcionario {

	private String setor;
	private boolean trabalhando;
	
	

	public Funcionario(String setor) {
		
		this.setor = setor;
		this.trabalhando = false;
	}

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
