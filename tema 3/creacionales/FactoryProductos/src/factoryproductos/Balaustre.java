/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryproductos;

/**
 *
 * @author Carlos
 */
public class Balaustre implements IProduct {
    @Override
    public IProduct makeproduct() {
        System.out.print("Se frabrico un balaustre");
        return this;
    }
    
}
