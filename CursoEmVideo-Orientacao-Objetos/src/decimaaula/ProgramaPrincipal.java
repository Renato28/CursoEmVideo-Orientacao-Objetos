package decimaaula;

/**
 * 
 * @author Renato Nobrega
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//criando um objeto e atribuindo valores aos atributos da classe Mamifero
		
		Mamifero mamifero = new Mamifero();
		mamifero.setPeso(20.5);
		mamifero.setIdade(10);
		mamifero.setMembros(4);
		mamifero.setCorDoPelo("preto");
		
		//executando os metodos da classe Mamifero
		
		mamifero.alimentar();
		mamifero.emitirSom();
		mamifero.locomover();
		
		//executando os valores dos atributos da classe Mamifero
		
		System.out.println(mamifero);
		
		//criando um objeto e atribuindo valores aos atributos da classe Reptil
		
		Reptil reptil = new Reptil();
		reptil.setPeso(12.7);
		reptil.setIdade(5);
		reptil.setMembros(4);
		reptil.setCorDaEscama("marrom");
		
		//executando os metodos da classe Reptil
		
		reptil.alimentar();
		reptil.emitirSom();
		reptil.locomover();
		
		//executando os valores dos atributos da classe Reptil
		
		System.out.println(reptil);
		
		//criando um objeto e atribuindo valores aos atributos da classe Peixe
		
		Peixe peixe = new Peixe();
		peixe.setPeso(14.5);
		peixe.setIdade(8);
		peixe.setMembros(0);
		peixe.setCorDaEscama("amarelo");
		
		//executando os metodos da classe Peixe
		
		peixe.alimentar();
		peixe.emitirSom();
		peixe.locomover();
		peixe.soltarBolha();
		
		//executando os valores dos atributos da classe Peixe
		
		System.out.println(peixe);
		
		//criando um objeto e atribuindo valores aos atributos da classe Ave
		
		Ave ave = new Ave();
		ave.setPeso(7.5);
		ave.setIdade(20);
		ave.setMembros(2);
		ave.setCorPena("branca");
		
		//executando os metodos da classe Ave
		
		ave.alimentar();
		ave.emitirSom();
		ave.locomover();
		
		//executando os valores dos atributos da classe Ave
		
		System.out.println(ave);
		
		//criando um objeto e atribuindo valores aos atributos da classe Cachorro
		
		Cachorro cachorro = new Cachorro();
		cachorro.setPeso(25.2);
		cachorro.setIdade(15);
		cachorro.setMembros(4);
		cachorro.setCorDoPelo("preto");
		
		//executando os metodos da classe Cachorro
		
		cachorro.abanarRabo();
		cachorro.alimentar();
		cachorro.emitirSom();
		cachorro.enterrarOsso();
		cachorro.locomover();
		
		//executando os valores dos atributos da classe Cachorro
		
		System.out.println(cachorro);
		
		//criando um objeto e atribuindo valores aos atributos da classe Canguru
		
		Canguru canguru = new Canguru();
		canguru.setPeso(30);
		canguru.setIdade(18);
		canguru.setMembros(4);
		canguru.setCorDoPelo("marrom");
		
		//executando os metodos da classe Canguru
		
		canguru.alimentar();
		canguru.emitirSom();
		canguru.locomover();
		canguru.usarBolsa();
		
		//executando os valores dos atributos da classe Canguru
		
		System.out.println(canguru);
	}

}
