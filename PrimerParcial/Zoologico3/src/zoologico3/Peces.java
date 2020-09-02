/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico3;

/**
 *
 * @author Carlos
 */
public class Peces implements IPeces {
   String nombre;
   float longitud;

    @Override
    public void nadar() {
        System.out.println("nadar");
    }
}
