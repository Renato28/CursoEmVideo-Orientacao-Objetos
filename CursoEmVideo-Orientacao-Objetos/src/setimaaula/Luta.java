package setimaaula;

public class Luta extends Lutador {

	public Luta(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
			int empates) {
		super(nome, nacionalidade, idade, altura, peso, vitorias, derrotas, empates);
		// TODO Auto-generated constructor stub
	}

	// atributos

	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	// Metodos

	public void marcarLuta(Lutador lutador1, Lutador lutador2) {
		
		if (lutador1.getCategoria().equals(lutador2.getCategoria() && (this.lutador1.getNome() != this.lutador2.getNome())) {
			
			
		}
	}

	public void lutar() {

	}

}
