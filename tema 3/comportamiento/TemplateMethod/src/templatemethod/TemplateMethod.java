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
public class TemplateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClaseAbstracta cc1 = new ClaseConcreta1();
        ClaseAbstracta cc2 = new ClaseConcreta2();
        // Obtener el resultado de multiplicar 3 por 100 y restarle 10
         int num1 = cc1.obtener(3);
        System.out.println( "num1: " + num1 );
        // Obtener el resultado de multiplicar 3 por 1000 y restarle 100
         int num2 = cc2.obtener(50);
        System.out.println( "num2: " + num2 );
    }
    
}
