package sextaaula;

public class ControleRemoto {
	
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
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
	
	
}
