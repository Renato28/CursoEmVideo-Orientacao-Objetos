package nonaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Aluno {
	
	//atributos
	
	private int matricula;
	private String curso;
	
	//metodo construtor
	
	public Aluno(int matricula, String curso) {

		this.matricula = matricula;
		this.curso = curso;
	}
	
	//metodos
	
	public void cancelarMatricula() {

	}
	
	//metodos getters e setters
	
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
