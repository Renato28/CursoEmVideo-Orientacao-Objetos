package setimaaula;

public class Lutador {

	// Atributos

	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	// Metodo construtor
	public Lutador() {

	}

	// Metodos

	public void apresentar() {

		System.out.println("Senhoras e Senhores, queremos apresentar o lutador " + this.getNome() + " ele veio do "
				+ this.getNacionalidade() + " tem " + this.getIdade() + " anos " + " " + this.getAltura() + " m  de altura "
				+ " pesa " + this.getPeso() + " kg " + " sua categoria �: " + this.getCategoria() + " tem " + this.getVitorias()
				+ " vit�rias " + " " + this.getDerrotas() + " derrotas " + " e " + this.getEmpates() + " empates ");
	}

	public void status() {

	}

	public void ganharLuta() {

	}

	public void perderLuta() {

	}

	public void empatarLuta() {

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
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
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
