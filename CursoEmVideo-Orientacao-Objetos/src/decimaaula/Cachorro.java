package decimaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Cachorro extends Lobo {

	// metodos

	public void enterrarOsso() {

		System.out.println("enterrando osso");
	}

	public void abanarRabo() {

		System.out.println("abanando o rabo");
	}

	// sobrecarga de metodos

	public void reagir(String frase) {

		if (frase.equals("toma comida") || frase.equals("olá")) {

			System.out.println("Abanar e latir");

		} else {

			System.out.println("Rosnar");
		}
	}

	public void reagir(int hora, int minuto) {

		if (hora < 12) {

			System.out.println("Abanar");

		} else if (hora >= 18) {

			System.out.println("Ignorar");

		} else {

			System.out.println("Abanar e Latir");
		}
	}

	public void reagir(boolean dono) {

		if (dono == true) {

			System.out.println("Abanar");

		} else {

			System.out.println("Rosnar e Latir");
		}
	}

	public void reagir(int idade, double peso) {

		if (idade < 5) {
			if (peso < 10) {

				System.out.println("Abanar");

			} else {

				System.out.println("Latir");
			}
		} else {
			if (peso < 10) {

				System.out.println("Rosnar");

			} else {

				System.out.println("Ignorar");
			}
		}
	}

	@Override

	// sobreposicao de metodo da classe Mamifero

	public void emitirSom() {

		System.out.println("Au! Au! Au!");
	}

	// metodo toString

	@Override
	public String toString() {
		return "Peso: " + this.peso + " idade: " + this.idade + " membros: " + this.membros;
	}

}
