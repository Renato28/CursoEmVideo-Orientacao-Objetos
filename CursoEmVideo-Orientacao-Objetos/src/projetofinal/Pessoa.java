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
	
	//construtor
	
	public Pessoa(String nome, int idade, String sexo, String experiencia) {
		
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = experiencia;
	}

	

}
