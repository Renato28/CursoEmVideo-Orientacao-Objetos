package sextaaula;

public class ControleRemoto implements Controlador{
	
	
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

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abrirMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligarMudo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desligarMudo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}
	
	
}
