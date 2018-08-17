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
		
		if(this.getLigado()) {
			
		System.out.println("----------MENU-----------");
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando? " + this.getTocando());
		System.out.println("Volume:" + this.getVolume());
		for(int i = 0; i <= this.getVolume(); i += 10) {
			
			System.out.println("|");
		}
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
		
		if((this.getLigado()) && this.getVolume() == 0) {
			
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		
		if((this.getLigado()) && !this.getTocando()) {
			
			this.setTocando(true);
		}
		
	}

	@Override
	public void pause() {
		
		if((this.getTocando()) && this.getTocando()){
			
			this.setTocando(false);
		}
	}
	
	
}
