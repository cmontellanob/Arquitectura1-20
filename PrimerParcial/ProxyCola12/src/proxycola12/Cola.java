/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxycola12;

/**
 *
 * @author Carlos
 */
public class Cola implements ICola{
    String [] elementos;
    int frente=0;
    int fin=0;
    int max=10;
    public Cola(int max) {
        this.max = max;
        elementos=new String[max];
    }
   
    @Override
    public void insertar(String elemento) {
        if (fin<=max)
        {
            elementos[fin]=elemento;
            fin++;
        }
        else
            System.out.print("La cola esta llena");
                
    }

    @Override
    public String eliminar() {
        String respuesta="";
        if (frente<fin)
        {
         respuesta=elementos[frente];
         frente++;
         
        }       
     return respuesta;
    }

    @Override
    public void mostrar() {
       for (int i=frente;i<fin;i++)
       {
           System.out.println(elementos[i]);
       }
    }
    
}
