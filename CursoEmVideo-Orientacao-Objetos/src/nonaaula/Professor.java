package nonaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Professor {
	
	//atributos
	
	private String especialidade;
	private double salario;
	
	//metodo construtor
	
	public Professor(String especialidade, double salario) {

		this.especialidade = especialidade;
		this.salario = salario;
	}
	
	//metodos
	
	public void receberAumento() {

	}
	
	// metodos getters e setters
	
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
