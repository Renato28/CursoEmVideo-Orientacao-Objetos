package nonaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Pessoa {

	// atributos
	
	private String nome;
	private int idade;
	private String sexo;
	
	//metodo construtor
	
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	// metodos
	
	public void fazerAniversario() {
		
		this.setIdade(this.getIdade() + 1);
	}
	
	//metodos getter e setters

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

}
