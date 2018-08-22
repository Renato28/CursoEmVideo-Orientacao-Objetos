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

		if (lutador1.getCategoria().equals(lutador2.getCategoria()) && (lutador1.getNome() != lutador2.getNome())) {
			
			this.aprovada = true;
			this.desafiado = lutador1;
			this.desafiante = lutador2;
		}else {
			
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}

	public void lutar() {

	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
