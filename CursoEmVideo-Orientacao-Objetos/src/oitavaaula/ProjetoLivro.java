package oitavaaula;

public class ProjetoLivro {

	public static void main(String[] args) {
		
		Pessoa[] p = new Pessoa[3];
		p[0] = new Pessoa("Renato", 30, 'M');
		p[1] = new Pessoa("Fernanda", 22, 'F');
		p[2] = new Pessoa("Andriel", 14, 'M');
		
		Livro[] l = new Livro[3];
		l[0] = new Livro("Iracema", "Jos� de Alencar", 300, p[0]);
		l[1] = new Livro("Saraminda", "Jos� Sarney", 450, p[1]);
		l[2] = new Livro("Brida", "Paulo Coelho", 250, p[2]);
		
	}

}
