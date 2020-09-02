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
public class Mamifero implements IMamiferos {
    String nombre;
    int temperatura;
    int nrodepatas;
    String color;

    @Override
    public int gettemperatura() {
        return temperatura;
    }

}
