package quartaaula;

public class Caneta {

	public String modelo;
	public String cor;
	private Float ponta;
	protected int carga;
	private boolean tampada;

	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}

	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! não posso rabiscar!");
		} else {
			System.out.println("Estou Rabiscando...");
		}
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPonta() {
		return this.ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return this.carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public boolean isTampada() {
		return this.tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
}
