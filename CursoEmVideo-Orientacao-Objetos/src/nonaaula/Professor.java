package nonaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Professor extends Pessoa {

	// atributos
	
	private String especialidade;
	private double salario;
	
	//codigo comentado
	
	/*public Professor(String nome, int idade, String sexo) {
		
		super(nome, idade, sexo);

	}*/

	// metodos

	public void receberAumento(double aumento) {
		
		this.salario += aumento;
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
	

	
	@Override
	public String toString() {
		
		//implementando o metodo toString com o StringBuffer
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(" Professor: ");
		stringBuffer.append(" Nome: ");
		stringBuffer.append(this.getNome());
		stringBuffer.append(", Idade: ");
		stringBuffer.append(this.getIdade());
		stringBuffer.append(", Sexo: ");
		stringBuffer.append(this.getSexo());
		stringBuffer.append(", Especialidade: ");
		stringBuffer.append(this.getEspecialidade());
		stringBuffer.append(", Salario: ");
		stringBuffer.append(this.getSalario());
		
		return stringBuffer.toString();
	}
	
	

}
