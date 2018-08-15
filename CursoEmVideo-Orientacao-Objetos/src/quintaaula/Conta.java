package quintaaula;

public class Conta {

	private String nomeDono;
	public int numConta;
	protected String tipo;
	private double saldo;
	private boolean status;
	
	public Conta() {
		
		this.status = false;
		this.saldo = 0;
	}
}
