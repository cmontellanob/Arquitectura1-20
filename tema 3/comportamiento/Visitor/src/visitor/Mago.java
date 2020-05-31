/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author Carlos
 */
class Mago implements IPersonaje{

     private String arma = "";
    // ------------------------------
    public Mago() {
    }
    // ------------------------------
    public String getArma()
    {
        return this.arma;
    }
    // ------------------------------
    public void setArma(String arma)
    {
        this.arma = arma;
    }
    // ------------------------------
    @Override
     public void accept( IVisitor visitor )
    {
         visitor.visit(this);
    }
    
}
