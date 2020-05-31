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
public class Semaforo {

    public void setEstado(IEstadoSemaforo estado) {
        this.estado = estado;
    }

    public Semaforo(IEstadoSemaforo estado) {
        this.estado = estado;
    }
    
    private IEstadoSemaforo estado;
    
    public void mostrar()
    {
        estado.mostrar();
    }
}
