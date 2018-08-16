package sextaaula;

public class ControleRemoto implements Controlador{
	
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		
		this.setVolume(50);
		this.setLigado(false);
		this.setTocando(false);
	}
	
	private void setVolume(int volume) {
		
		this.volume = volume;
	}
	
	private int getVolume() {
		
		return this.volume;
	}
	
	private void setLigado(boolean ligado) {
		
		this.ligado = ligado;
	}
	
	private boolean getLigado() {
		
		return this.ligado;
	}
	
	private void setTocando(boolean tocando) {
		
		this.tocando = tocando;
	}
	
	private boolean getTocando() {
		
		return this.tocando;
	}

	@Override
	public void ligar() {
		
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		
		
	}

	@Override
	public void fecharMenu() {
		
		
	}

	@Override
	public void maisVolume() {
		
		
	}

	@Override
	public void menosVolume() {
		
		
	}

	@Override
	public void ligarMudo() {
		
		
	}

	@Override
	public void desligarMudo() {
		
		
	}

	@Override
	public void play() {
		
		
	}

	@Override
	public void pause() {
		
		
	}
	
	
}
