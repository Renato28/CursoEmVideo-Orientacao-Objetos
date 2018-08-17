package sextaaula;

public class Aula06 {

	public static void main(String[] args) {
		
		ControleRemoto controle = new ControleRemoto();
		
		controle.ligar();
		controle.maisVolume();
		controle.maisVolume();
		controle.desligarMudo();
		controle.play();
		controle.pause();
		controle.abrirMenu();
		controle.fecharMenu();
	}

}
