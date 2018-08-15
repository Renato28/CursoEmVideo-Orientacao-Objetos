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
		
		if(this.status == true && this.saldo > 0) {
			
			this.saldo -= valor;
		}
	}
	
	public void depositar(double valor) {
		
		if(this.status == true) {
			
			this.saldo += valor;
		}
		
	}
	
	public void pagarMensalidade() {
		
		if(this.tipo == "CP") {
			
			this.saldo = this.saldo - 20;
		}
		
		if(this.tipo == "CC") {
			
			this.saldo = this.saldo - 12;
		}
	}
	
}
