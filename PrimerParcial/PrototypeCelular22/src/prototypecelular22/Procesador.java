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
public class Procesador {
 String marca;
    int cantidadNucelos;
    double Frecuencia;
    public Procesador(String marca, int cantidadNucelos, double Frecuencia) {
        this.marca = marca;
        this.cantidadNucelos = cantidadNucelos;
        this.Frecuencia = Frecuencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadNucelos() {
        return cantidadNucelos;
    }

    public void setCantidadNucelos(int cantidadNucelos) {
        this.cantidadNucelos = cantidadNucelos;
    }

    public double getFrecuencia() {
        return Frecuencia;
    }

    public void setFrecuencia(double Frecuencia) {
        this.Frecuencia = Frecuencia;
    }
   
}
