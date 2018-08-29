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
	
	// metodos

	public void cancelarMatricula() {
		
		System.out.println("Matricula cancelada com sucesso!");
	}
	
	public void pagarMensalidade() {
		
		System.out.println("Mensalidade do aluno " + this.nome + " paga com sucesso!");
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
	
	@Override
	public String toString() {
		
		//implementando o metodo toString com o StringBuffer
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Aluno: ");
		stringBuffer.append(" Nome: ");
		stringBuffer.append(this.getNome());
		stringBuffer.append(", Idade: ");
		stringBuffer.append(this.getIdade());
		stringBuffer.append(", Sexo: ");
		stringBuffer.append(this.getSexo());
		stringBuffer.append(", Matricula: ");
		stringBuffer.append(this.getMatricula());
		stringBuffer.append(", Curso: ");
		stringBuffer.append(this.getCurso());
		
		return stringBuffer.toString();
	}
	
	

}
