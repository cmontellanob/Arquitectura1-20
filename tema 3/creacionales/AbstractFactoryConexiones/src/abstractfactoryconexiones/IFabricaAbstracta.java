package abstractfactoryconexiones;

public interface IFabricaAbstracta {

	IConexionBD getBD(String motor);
	IConexionREST getREST(String area);
	
}
