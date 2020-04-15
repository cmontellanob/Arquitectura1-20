/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simple.Responsability.despues;

/**
 *
 * @author Carlos
 */
public class Solid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Coche coche=new Coche("Fiat");
          CocheDB manejador=new CocheDB();
          manejador.guardarCocheDB(coche);

    }
    
}
