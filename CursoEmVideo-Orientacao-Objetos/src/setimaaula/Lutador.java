package setimaaula;

public class Lutador {

	// Atributos

	protected String nome;
	protected String nacionalidade;
	protected int idade;
	protected double altura;
	protected double peso;
	protected String categoria;
	protected int vitorias;
	protected int derrotas;
	protected int empates;

	// Metodo construtor

	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
			int empates) {

		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	// Metodos

	public void apresentar() {

		System.out.println("CHEGOU A HORA! o lutador " + this.getNome());
		System.out.println("veio diretamente de " + this.getNacionalidade());
		System.out.println("tem " + this.getIdade() + " e " + this.getAltura() + " m");
		System.out.println("pesando " + this.getPeso() + " Kg");
		System.out.println(this.getVitorias() + " vitórias");
		System.out.println(this.getDerrotas() + " derrotas e ");
		System.out.println(this.getEmpates() + " empates");
			
	}

	public void status() {

		System.out.println("Nome: " + this.getNome());
		System.out.println("Peso: " + this.getPeso() + " kg");
		System.out.println("Vitórias: " + this.getVitorias());
		System.out.println("Derrotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());
	}

	public void ganharLuta() {

		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {

		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {

		this.setEmpates(this.getEmpates() + 1);
	}

	// Metodos Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		
		if (this.peso < 52.2) {

			this.categoria = "Invalido";
			
		} else if (this.peso <= 70.3) {

			this.categoria = "Leve";
			
		} else if (this.peso <= 83.9) {

			this.categoria = "Médio";
			
		} else if (this.peso <= 120.2) {

			this.categoria = "Pesado";
		}
		else {
			
			this.categoria = "Invalido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

}
