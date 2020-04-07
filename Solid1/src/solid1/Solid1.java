/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid1;

/**
 *
 * @author Carlos
 */
public class Solid1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche []arrayCoches= {
        new Renault(),
            new Audi(),
            new Mercedes()
    };
        imprimirPrecioMedioCoches(arrayCoches);
    }
    static void imprimirPrecioMedioCoches(Coche[] arrayCoches)
    {
        for(Coche coche:arrayCoches)
        {
            System.out.println(coche.PrecioMedioCoche());
        }
    }
    
}
