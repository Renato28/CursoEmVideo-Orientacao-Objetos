package nonaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public abstract class Pessoa {

	// atributos
	
	private String nome;
	private int idade;
	private String sexo;
	
	//codigo comentado
	
	/*public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}*/
	
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

	@Override
	public String toString() {
		
		//implementando o metodo toString com o StringBuffer
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Pessoa:");
		stringBuffer.append("Nome: ");
		stringBuffer.append(this.nome);
		stringBuffer.append(", Idade: ");
		stringBuffer.append(this.idade);
		stringBuffer.append(", Sexo: ");
		stringBuffer.append(this.sexo);
		
		return stringBuffer.toString();
	}
	
	

}
