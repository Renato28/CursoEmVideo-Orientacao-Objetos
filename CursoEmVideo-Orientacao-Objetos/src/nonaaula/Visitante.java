package nonaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Visitante extends Pessoa{
	
	//implementando o metodo tostring com o StringBuffer
	
	@Override
	public String toString() {
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Visitante: ");
		stringBuffer.append(" Nome: ");
		stringBuffer.append(this.getNome());
		stringBuffer.append(", Idade: ");
		stringBuffer.append(this.getIdade());
		stringBuffer.append(", Sexo: ");
		stringBuffer.append(this.getSexo());
		
		return stringBuffer.toString();
	}

	
}
