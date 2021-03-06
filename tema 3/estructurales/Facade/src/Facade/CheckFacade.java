package Facade;

public class CheckFacade {

	private AvionAPI avionAPI;
	private HotelAPI hotelAPI;
        private AtractivosAPI atractivosAPI;
	
	public CheckFacade() {
		avionAPI = new AvionAPI();
		hotelAPI = new HotelAPI();
                atractivosAPI = new AtractivosAPI();
                
	}
	
	public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
	
                avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
		hotelAPI.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
		atractivosAPI.buscarAtractivos(fechaIda, fechaVuelta,  destino);

        }		
}
