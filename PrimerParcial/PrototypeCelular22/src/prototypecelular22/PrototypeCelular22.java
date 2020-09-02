/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypecelular22;

/**
 *
 * @author Carlos
 */
public class PrototypeCelular22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Celular samsung=new Celular("Samsung","S7",new TamanoPantalla(3,5),"negro",16,new Procesador("Atom",4,3.3));
        ICelular samsung2=samsung.clonar();
    }
    
}
