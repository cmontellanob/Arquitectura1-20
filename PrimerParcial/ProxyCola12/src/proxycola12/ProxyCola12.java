/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxycola12;

/**
 *
 * @author Carlos
 */
public class ProxyCola12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProxyCola proxy=new ProxyCola(10);
        proxy.insertar("a");
        proxy.insertar("b");
        proxy.insertar("c");
        proxy.insertar("d");
        proxy.mostrar();
        proxy.mostrarHistorial();
        
    }
    
}
