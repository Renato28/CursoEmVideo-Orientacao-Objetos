package projetofinal;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Gafanhoto extends Pessoa {

	// atributos

	private String login;
	private int totalAssistido;

	// construtor

	public Gafanhoto(String nome, int idade, String sexo, String login) {

		super(nome, idade, sexo);
		this.login = login;
		this.totalAssistido = 0;

	}

	// metodos getters e setters

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotalAssistido() {
		return totalAssistido;
	}

	public void setTotalAssistido(int totalAssistido) {
		this.totalAssistido = totalAssistido;
	}

	// metodo de sobreposicao

	@Override
	public void ganharExperiencia() {

	}

	// metodo

	public void viuMaisUm() {

		this.setTotalAssistido(this.getTotalAssistido() + 1);
	}
	
	//metodo toString
	
	@Override
	public String toString() {
		return "Gafanhoto [login=" + super.toString() + login + ", totalAssistido=" + totalAssistido + "]";
	}

	
}
