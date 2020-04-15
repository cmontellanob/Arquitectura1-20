package factory;

public class ConexionFabrica {

    public IConexion getConexion(String motor) {
        switch (motor) {
            case "MySQL":
                return new ConexionMySQL();
            case "PostgreSQL":
                return new ConexionPostgreSQL();
            case "Sqlite":
                return new ConexionSQLite();
            default:
                return new ConexionVacia();
        }

    }
}
