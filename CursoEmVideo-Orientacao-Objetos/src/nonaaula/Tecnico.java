package nonaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Tecnico extends Aluno {

	// atributo

	private boolean registroProfissional;
	
	//metodo
	
	public void praticar() {
		
		
	}

	//metodo getter e setter
	
	public boolean isRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(boolean registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	
	//implementando o metodo toString com StringBuffer
	
	@Override
	public String toString() {
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Técnico: ");
		stringBuffer.append(" Nome: ");
		stringBuffer.append(this.getNome());
		stringBuffer.append(", Idade: ");
		stringBuffer.append(this.getIdade());
		stringBuffer.append(", Sexo: ");
		stringBuffer.append(this.getSexo());
		stringBuffer.append(", Registro Profissional: ");
		stringBuffer.append(this.isRegistroProfissional());
		
		return stringBuffer.toString();
	}
	
	

}
