package patos;

public class PatoAzul extends Pato{
	
	public PatoAzul(){
		comportamientoDeVuelo = new VueloAlto();
		comportamientoDeQuack = new Quack();
	}

}
