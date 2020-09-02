/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico3;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class Zoologico { 
    String nombre;
    ArrayList<Jaula> jaulas;
    String direccion;
    String telefono;
    private static Zoologico Instance=null;
    private Zoologico() {
        nombre="Zoologico Etretenimiento";
        jaulas=new ArrayList<Jaula>();
        direccion="AV Los animales";
        telefono="7285565";
        
    }
    
    public static Zoologico getInstance()
    {
        if (Instance==null)
            Instance=new Zoologico();
        return Instance;
    }
}
