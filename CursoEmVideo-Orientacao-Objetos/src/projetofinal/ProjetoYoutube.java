package projetofinal;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class ProjetoYoutube {

	public static void main(String[] args) {
		
		//criando um vetor e adicionando valores ao objeto da classe Video
		
		Video[] videos = new Video[3];
		videos[0] = new Video("Aula 01 de POO");
		videos[1] = new Video("Aula 12 de JAVA");
		videos[2] = new Video("Aula 10 de HTML5");
		
		//criando um vetor e adicionando valores ao objeto da classe Gafanhoto
		
		Gafanhoto[] gafanhotos = new Gafanhoto[2];
		gafanhotos[0] = new Gafanhoto("Renato", 30, "M", "Java");
		gafanhotos[1] = new Gafanhoto("Felipe", 28, "M", "JavaScript");
		
		//executando os valores do vetor da classe Video
		
		System.out.println(videos[0].toString());
		System.out.println(videos[1].toString());
		System.out.println(videos[2].toString());
		
		//executando os valores do vetor da classe Gafanhoto
		
		System.out.println(gafanhotos[0].toString());
		System.out.println(gafanhotos[1].toString());
		
		//criando um vetor e adicionando valores ao objeto da classe Visualização
		
		Visualizacao[] visualizacao = new Visualizacao[2];
		visualizacao[0] = new Visualizacao(gafanhotos[0], videos[0]);
		visualizacao[1] = new Visualizacao(gafanhotos[1], videos[1]);
		
		//executando os valores do vetor da classe Visualização
		
		System.out.println(visualizacao.toString());
		
	}

}
