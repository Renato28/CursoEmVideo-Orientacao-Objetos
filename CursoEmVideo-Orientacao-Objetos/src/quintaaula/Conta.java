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

		if (this.tipo == "CC") {
			this.saldo = this.saldo + 50;
		} else if (this.tipo == "CP") {
			this.saldo = this.saldo + 150;
		}
		this.status = true;
	}

	public void fecharConta() {

	}

	public void sacar(double valor) {

		if (this.status == true && this.saldo > 0) {

			this.saldo -= valor;
		}
	}

	public void depositar(double valor) {

		if (this.status == true) {

			this.saldo += valor;
		}

	}

	public void pagarMensalidade() {

		if (this.tipo == "CP") {

			this.saldo = this.saldo - 20;
		}

		if (this.tipo == "CC") {

			this.saldo = this.saldo - 12;
		}
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
