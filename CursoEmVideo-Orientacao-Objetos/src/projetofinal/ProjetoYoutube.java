package projetofinal;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class ProjetoYoutube {

	public static void main(String[] args) {
		
		//criando um vetor e adicionando valores ao objeto
		
		Video[] videos = new Video[3];
		videos[0] = new Video("Aula 01 de POO");
		videos[1] = new Video("Aula 12 de JAVA");
		videos[2] = new Video("Aula 10 de HTML5");
		
		//executando os valores do vetor
		
		System.out.println(videos[0].toString());
		System.out.println(videos[1].toString());
		System.out.println(videos[2].toString());
		
	}

}
