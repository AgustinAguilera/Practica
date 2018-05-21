package patos;

public abstract class Pato {
	ComportamientoDeQuack comportamientoDeQuack;
	ComportamientoDeVuelo comportamientoDeVuelo;
	
	
	public void setearVuelo(ComportamientoDeVuelo a){
		this.comportamientoDeVuelo = a;
	}
	
	public void setearQuack(ComportamientoDeQuack b){
		this.comportamientoDeQuack = b;
	}
	public void volar(){
		this.comportamientoDeVuelo.vuelo();
	}
	public void hacerQuack(){
		this.comportamientoDeQuack.quack();
	}
}
