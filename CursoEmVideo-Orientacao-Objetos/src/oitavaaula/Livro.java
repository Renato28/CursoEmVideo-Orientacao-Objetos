package oitavaaula;

public class Livro {

	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	public void detalhes() {

	}

	public void setTitulo(String titulo) {

		this.titulo = titulo;
	}

	public String gettitulo() {

		return this.titulo;
	}

	public void setAutor(String autor) {

		this.autor = autor;
	}

	public String getAutor() {

		return this.autor;
	}

	public void setTotPaginas(int totPaginas) {

		this.totPaginas = totPaginas;
	}

	public int getTotPaginas() {

		return this.totPaginas;
	}

	public void setPagAtual(int pagAtual) {

		this.pagAtual = pagAtual;
	}

	public int getPagAtual() {

		return this.pagAtual;
	}

	public void setAberto(boolean aberto) {

		this.aberto = aberto;
	}

	public boolean isAberto() {

		return this.aberto;
	}

	public void setLeitor(Pessoa leitor) {

		this.leitor = leitor;
	}

	public Pessoa getLeitor() {

		return this.leitor;
	}
}
