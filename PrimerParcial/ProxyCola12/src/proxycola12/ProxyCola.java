/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxycola12;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class ProxyCola implements ICola {
    private Cola c;
    private ArrayList<String> acciones; 
    
     public ProxyCola (int max) {
         c=new Cola(max);
         acciones=new ArrayList<String>();

    }
    
    @Override
    public void insertar(String elemento) {
       acciones.add("se inserto el elemnto "+elemento);
        c.insertar(elemento);
       
    }

    @Override
    public String eliminar() {
        String respuesta=c.eliminar();
        acciones.add("se elimino el elemnto "+respuesta);
     return respuesta;       
    }

    @Override
    public void mostrar() {
        acciones.add("se mostro la cola ");
        c.mostrar();
    }
    
    public void mostrarHistorial()
    {
       System.out.print(acciones.toString());
    }
    
}
