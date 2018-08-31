package projetofinal;

/**
 * 
 * @author Renato Nobrega
 *
 */
public abstract class Pessoa {

	// atributos

	protected String nome;
	protected int idade;
	protected String sexo;
	protected String experiencia;

	// construtor

	public Pessoa(String nome, int idade, String sexo, String experiencia) {

		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = experiencia;
	}

	// metodos getters e setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	// metodo abstrato

	public abstract void ganharExperiencia();

	//metodo toString
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + "]";
	}

}
