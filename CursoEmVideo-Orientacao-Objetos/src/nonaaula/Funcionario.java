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
	
	
	
	@Override
	public String toString() {
		
		//implementando o metodo toString com o StringBuffer
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Funcionario: ");
		stringBuffer.append(" Nome: ");
		stringBuffer.append(this.getNome());
		stringBuffer.append(", Idade: ");
		stringBuffer.append(this.getIdade());
		stringBuffer.append(", Sexo: ");
		stringBuffer.append(this.getSexo());
		stringBuffer.append(", Setor: ");
		stringBuffer.append(this.getSetor());
		stringBuffer.append(", Trabalhando: ");
		stringBuffer.append(this.isTrabalhando());
		
		return stringBuffer.toString();
	}

	
}
