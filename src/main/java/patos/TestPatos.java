package patos;

public class TestPatos {

	public static void main(String[] args) {
		PatoAzul patoAzul = new PatoAzul();
		PatoRojo patoRojo = new PatoRojo();
		
		patoAzul.volar();
		patoAzul.hacerQuack();
		
		patoRojo.volar();
		patoRojo.hacerQuack();
		
		patoAzul.setearVuelo(new NoVuela());
		patoAzul.setearQuack(new Squeak());
		
		patoAzul.volar();
		patoAzul.hacerQuack();
		
	}

}
