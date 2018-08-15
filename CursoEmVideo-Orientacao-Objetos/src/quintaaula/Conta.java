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
	
	public void abrirConta() {
		
		this.status = true;
	}
	
	public void fecharConta() {
		
	}
	
	public void sacar(double valor) {
		
		this.saldo -= valor;
	}
	
}
