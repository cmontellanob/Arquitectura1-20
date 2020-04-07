/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Carlos
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingleObject a=SingleObject.getInstance();
        a.setMensage("Hola");
        System.out.print(a.getMensage());
        SingleObject b=SingleObject.getInstance();
        b.setMensage("Buenas Tardes");
        System.out.print(a.getMensage());
        
    }
    
}
