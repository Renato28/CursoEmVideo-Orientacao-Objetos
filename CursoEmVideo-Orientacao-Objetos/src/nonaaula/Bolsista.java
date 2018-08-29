package nonaaula;

public class Bolsista extends Aluno {
	
	//atributos
	
	private String bolsa;

	//criando o metodo getter e setter
	
	//metodos
	
	
	public void renovarBolsa() {
		
		System.out.println("Bolsa do aluno " + this.nome + " renovada com sucesso!");
	}
	
	@Override
	public void pagarMensalidade() {
		
		
	}
	
	
	public String getBolsa() {
		return bolsa;
	}

	public void setBolsa(String bolsa) {
		this.bolsa = bolsa;
	}
	
	//implementando o metodo toString com o StringBuffer
	
	@Override
	public String toString() {
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Bolsista: ");
		stringBuffer.append(" Nome: ");
		stringBuffer.append(this.getNome());
		stringBuffer.append(", Idade: ");
		stringBuffer.append(this.getIdade());
		stringBuffer.append(", Sexo: ");
		stringBuffer.append(this.getSexo());
		stringBuffer.append(", Bolsa: ");
		stringBuffer.append(this.getBolsa());
		
		return stringBuffer.toString();
	}
	
	
	
	
}
