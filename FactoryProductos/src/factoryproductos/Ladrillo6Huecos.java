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
public class Ladrillo6Huecos implements IProduct {
    @Override
    public IProduct makeproduct() {
        System.out.print("SE frabrico un ladrillo 6 huecos");
        return this;
    }
}
