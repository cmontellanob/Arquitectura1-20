/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryproductos;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class FactoryProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);  // Create a Scanner object
        FabricaProductos fabrica=new FabricaProductos(); 
        System.out.println("Que quiere Fabricar (Balaustre,Ladrillo,Ladrillo6Huecos,Teja)");
        String producto = entrada.nextLine();  // Read user input
        IProduct p =fabrica.FabricarProducto(producto);
        p.makeproduct();
        
        
    }
    
}
