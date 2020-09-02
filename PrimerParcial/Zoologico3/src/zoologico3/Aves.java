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
public class Aves implements IAves {
    String nombre;
    float peso;
    int tamanoalas;

    @Override
    public void volar() {
        System.out.println("volar");
    }
}
