package patos;

public class PatoRojo extends Pato{

	public PatoRojo(){
		comportamientoDeVuelo = new NoVuela();
		comportamientoDeQuack = new Squeak();
	}
}
