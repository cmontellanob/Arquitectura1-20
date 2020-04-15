/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simple.Responsability.antes;

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
        Coche coche=new Coche("Ford");
        coche.guardarCocheDB(coche);
    }
    
}
