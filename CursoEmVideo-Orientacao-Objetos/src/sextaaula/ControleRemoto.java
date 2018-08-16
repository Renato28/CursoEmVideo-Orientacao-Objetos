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
		
		System.out.println(this.getLigado());
		System.out.println(this.getVolume());
		for(int i = 0; i <= this.getVolume(); i += 1) {
			
			System.out.println("|");
			System.out.println(this.getTocando());
		}
	}

	@Override
	public void fecharMenu() {
		
		
	}

	@Override
	public void maisVolume() {
		
		if(this.getLigado()) {
			this.setVolume(this.getVolume() + 1);
		}
	}

	@Override
	public void menosVolume() {
		
		if(this.getLigado()) {
			
			this.setVolume(this.getVolume() -1);
		}
	}

	@Override
	public void ligarMudo() {
		
		if((this.getLigado()) && this.getVolume() > 0) {
			
			this.setVolume(0);
		}
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
