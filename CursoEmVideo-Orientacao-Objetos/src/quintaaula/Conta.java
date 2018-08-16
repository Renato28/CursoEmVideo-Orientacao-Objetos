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

	public void abrirConta(String tipo) {

		this.setTipo(tipo);
		this.setStatus(true);

		if (tipo == "CC") {
			this.setSaldo(50);
		} else if (tipo == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}

	public void fecharConta() {

		if (this.getSaldo() > 0) {

			System.out.println("Conta com dinheiro");

		} else if (this.getSaldo() < 0) {

			System.out.println("Conta com débito");
		} else {

			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	public void sacar(double valor) {

		if (this.isStatus()) {

			if(this.getSaldo() >= valor) {
				
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.getNomeDono());
			}else {
				System.out.println("Saldo insuficiente para saque!");
			}
		}else {
			System.out.println("Impossivel sacar de uma conta fechada!");
		}
	}

	public void depositar(double valor) {

		if (this.isStatus()) {

			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Deposito realizado na conta de !" + this.getNomeDono());
		} else {
			System.out.println("Inpossivel depositar em uma conta fechada!");
		}

	}

	public void pagarMensalidade() {
		
		int valor = 0;

		if (this.getTipo() == "CP") {

			valor = 12;
		}

		if (this.getTipo() == "CC") {

			valor = 20;
		}
		if (this.isStatus()) {

			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Mensalidade paga com sucesso por " + this.getNomeDono());

		} else {

			System.out.println("Impossivel pagar uma conta fechada!");
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
