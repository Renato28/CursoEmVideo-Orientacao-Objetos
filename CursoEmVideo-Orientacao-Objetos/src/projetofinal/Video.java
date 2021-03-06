package projetofinal;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class Video implements AcoesVideo {

	// atributos

	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;

	// metodo construtor

	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	
	

	// metodos getters e setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	// metodos de sobreposicao

	@Override
	public void play() {

		this.setReproduzindo(true);
	}

	@Override
	public void pause() {

		this.setReproduzindo(false);
	}

	@Override
	public void like() {

		this.setCurtidas(this.getCurtidas() + 1);
	}
	
	
	//metodo toString
	
	@Override
	public String toString() {
		
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}

}
