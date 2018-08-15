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
		System.out.println("Est� tampada? " + this.tampada);
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! n�o posso rabiscar!");
		} else {
			System.out.println("Estou Rabiscando...");
		}
	}
}
