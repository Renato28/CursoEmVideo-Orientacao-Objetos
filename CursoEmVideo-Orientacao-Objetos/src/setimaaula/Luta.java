package setimaaula;

import java.util.Random;

public class Luta {

	// atributos

	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	// Metodos

	public void marcarLuta(Lutador lutador1, Lutador lutador2) {

		if (lutador1.getCategoria().equals(lutador2.getCategoria()) && (lutador1 != lutador2)) {
			
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
		
		if(this.isAprovada()) {
			
			this.desafiado.apresentar();
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0 1 2
			
			switch (vencedor) {
			
			case 0: //Empate
				System.out.println("Empatou!");
				desafiado.empatarLuta();
				desafiante.empatarLuta();
				break;
			case 1: //Ganhou Desafiado
				System.out.println("Vitoria do " + desafiado.getNome());
				desafiado.ganharLuta();
				desafiante.perderLuta();
				break;
			case 2: //Ganhou Desafiante
				System.out.println("Vitoria do " + desafiante.getNome());
				desafiante.ganharLuta();
				desafiado.perderLuta();
				break;
			default:
				System.out.println("Luta não pode acontecer!");
				break;
			}
		}
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
