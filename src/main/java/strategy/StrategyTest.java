package strategy;

public class StrategyTest {

	public static void main(String[] args) {
		AvionComercial avionComercial = new AvionComercial();
		AvionDeGuerra avionDeGuerra = new AvionDeGuerra();
		
		avionComercial.setAlgoritmo(new Carretear());
		avionComercial.mover();
		
		avionDeGuerra.setAlgoritmo(new Carretear());
		avionDeGuerra.mover();
		avionDeGuerra.setAlgoritmo(new Volando());
		avionDeGuerra.mover();
		
		avionComercial.setAlgoritmo(new VolandoAlto());
		avionComercial.mover();
	}

}
