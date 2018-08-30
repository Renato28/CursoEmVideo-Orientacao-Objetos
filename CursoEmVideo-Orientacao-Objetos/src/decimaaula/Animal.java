package decimaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public abstract class Animal {

	// atributos

	protected double peso;
	protected int idade;
	protected int membros;
	
	//metodos abstratos
	
	public abstract void locomover();
	
	public abstract void alimentar();
	
	public abstract void emitirSom();
	
	//metodos getters e setters

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}
	
	//metodo toString
	
	@Override
	public String toString() {
		
		return "Animal [peso=" + peso + ", idade=" + idade + ", membros=" + membros + "]";
	}
	
	

}
