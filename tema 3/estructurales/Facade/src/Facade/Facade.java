package Facade;

public class Facade {
	
	public static void main(String[] args) {
		CheckFacade cliente1 = new CheckFacade();
		cliente1.buscar("02/07/2018", "08/07/2018", "Sucre", "Santa Cruz");
		
		CheckFacade cliente2 = new CheckFacade();
		cliente2.buscar("02/07/2018", "08/07/2018", "Sucre", "La Paz");
	}

}
