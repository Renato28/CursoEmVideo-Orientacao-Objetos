package nonaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Aluno extends Pessoa {

	// atributos
	
	private int matricula;
	private String curso;
	
	//codigo comentado
	
	/*public Aluno(String nome, int idade, String sexo) {

		super(nome, idade, sexo);

	}*/

	// metodos

	public void cancelarMatricula() {

	}

	// metodos getters e setters

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
