/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simple.Responsability.despues;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class CocheDB {
     void guardarCocheDB(Coche coche)  {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Simple.Responsability.antes.Coche.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bd_estacionamiento", "root", "");
            PreparedStatement consulta = con.prepareStatement("INSERT INTO coches (marca) VALUES('"+coche.getMarca()+"')");
            consulta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Coche.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
}
