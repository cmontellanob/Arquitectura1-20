/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author Carlos
 */
class ClaseConcreta2 extends ClaseAbstracta {

    @Override
    public int multiplicar(int num) {
        return num * 1000; }

    @Override
    public int sumar(int num) {
       return num + 100;
    }
    
}
