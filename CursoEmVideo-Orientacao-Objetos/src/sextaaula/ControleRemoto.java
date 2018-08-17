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
		System.out.println("Est� ligado? " + this.getLigado());
		System.out.println("Est� tocando? " + this.getTocando());
		System.out.println("Volume:" + this.getVolume());
		for(int i = 0; i <= this.getVolume(); i += 10) {
			
			System.out.print("|");
			System.out.println("Impossivel abrir o menu");
		}
	}
}
	@Override
	public void fecharMenu() {
		
		System.out.println("Fechando Menu...");
	}

	@Override
	public void maisVolume() {
		
		if(this.getLigado()) {
			
			this.setVolume(this.getVolume() + 1);
			
		}else {
			
			System.out.println("Impossivel aumentar volume");
		}
	}

	@Override
	public void menosVolume() {
		
		if(this.getLigado()) {
			
			this.setVolume(this.getVolume() -1);
			
		}else {
			
			System.out.println("Impossivel diminuir volume");
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
			
		}else {
			
			System.out.println("N�o consegui reproduzir");
		}
		
	}

	@Override
	public void pause() {
		
		if((this.getTocando()) && this.getTocando()){
			
			this.setTocando(false);
			
		}else {
			
			System.out.println("N�o consegui pausar");
		}
	}
	
	
}
