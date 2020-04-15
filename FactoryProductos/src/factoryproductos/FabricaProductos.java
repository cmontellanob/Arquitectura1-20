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
public class FabricaProductos {
    
    public IProduct FabricarProducto(String Producto )
    {
        IProduct p;
        switch (Producto)
        {
            case "Ladrillo":
                    p= new  Ladrillo(); 
                    break;
            case "Ladrillo6Huecos":
                    p= new  Ladrillo6Huecos(); 
                    break;
            case "Teja":
                    p= new  Teja();
                    break;
            case "Balaustre":
                    p= new  Balaustre();
                    break;
            default: 
                    p= null;
                
        }
        return p;
    }     
        
    
}
