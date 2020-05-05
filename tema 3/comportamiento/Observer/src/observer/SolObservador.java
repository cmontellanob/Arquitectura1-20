package observer;

public class SolObservador extends Observador {

	private double valorCambio = 3.38;
	
	public SolObservador(SubjectCasa sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {		
		System.out.println("Sol: " + (sujeto.getMonto() * valorCambio));
	}
}
