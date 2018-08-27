package oitavaaula;

public class ProjetoLivro {

	public static void main(String[] args) {
		
		Pessoa[] p = new Pessoa[3];
		p[0] = new Pessoa("Renato", 30, 'M');
		p[1] = new Pessoa("Fernanda", 22, 'F');
		p[2] = new Pessoa("Andriel", 14, 'M');
		
		Livro[] l = new Livro[3];
		l[0] = new Livro("Iracema", "José de Alencar", 300, p[0]);
		l[1] = new Livro("Saraminda", "José Sarney", 450, p[1]);
		l[2] = new Livro("Brida", "Paulo Coelho", 250, p[2]);
		
		System.out.println(l[0].detalhes());
		System.out.println(l[1].detalhes());
		System.out.println(l[2].detalhes());
		
	}

}
