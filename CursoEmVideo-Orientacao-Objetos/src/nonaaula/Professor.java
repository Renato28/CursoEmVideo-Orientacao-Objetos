package nonaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Professor extends Pessoa {

	// atributos
	
	//metodo construtor
	
	public Professor(String nome, int idade, String sexo) {
		
		super(nome, idade, sexo);

	}

	private String especialidade;
	private double salario;

	// metodos

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
