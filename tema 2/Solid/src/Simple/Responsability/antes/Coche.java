/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simple.Responsability.antes;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class Coche {

    String marca;

    public String getMarcaCoche() {
        return marca;
    }

    public Coche(String marca) {
        this.marca = marca;
    }

    void guardarCocheDB(Coche coche)  {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Coche.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bd_estacionamiento", "root", "");
            PreparedStatement consulta = con.prepareStatement("INSERT INTO coches (marca) VALUES('"+coche.marca+"')");
            consulta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Coche.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
}
