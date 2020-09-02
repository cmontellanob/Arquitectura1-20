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
public class Celular implements ICelular {
    String marca;
    String modelo;
    TamanoPantalla tamanopantalla;
    String color;
    int memoria;
    Procesador procesador;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TamanoPantalla getTamanopantalla() {
        return tamanopantalla;
    }

    public void setTamanopantalla(TamanoPantalla tamanopantalla) {
        this.tamanopantalla = tamanopantalla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public Celular(String marca, String modelo, TamanoPantalla tamanopantalla, String color, int memoria, Procesador procesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanopantalla = tamanopantalla;
        this.color = color;
        this.memoria = memoria;
        this.procesador = procesador;
    }

    @Override
    public ICelular clonar() {
        Celular celular = null;

		try {
			celular = (Celular) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return celular;
    }

}
