/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Carlos
 */
public class State {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Semaforo s=new Semaforo(new EstadoVerde());
        s.mostrar();
        s.setEstado(new EstadoAmarillo());
        s.mostrar();
        
        
    }
    
}
