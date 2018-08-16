package quintaaula;

public class Aula05 {

	public static void main(String[] args) {
		
		Conta p1 = new Conta();
		p1.setNumConta(1111);
		p1.setNomeDono("Jubileu");
		p1.abrirConta("CC");
		
		Conta p2 = new Conta();
		p2.setNumConta(2222);
		p2.setNomeDono("Creuza");
		p2.abrirConta("CP");
	}

}
