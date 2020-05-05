/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

/**
 *
 * @author Carlos
 */
class Hotel {
    int idhotel;
    int idhabitacion;
    String descripcionhotel;
    String descripcionhabitacion;
    double precio;  
    
    public int getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(int idhotel) {
        this.idhotel = idhotel;
    }

    public int getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public String getDescripcionhotel() {
        return descripcionhotel;
    }

    public void setDescripcionhotel(String descripcionhotel) {
        this.descripcionhotel = descripcionhotel;
    }

    public String getDescripcionhabitacion() {
        return descripcionhabitacion;
    }

    public void setDescripcionhabitacion(String descripcionhabitacion) {
        this.descripcionhabitacion = descripcionhabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Hotel(int idhotel, int idhabitacion, String descripcionhotel, String descripcionhabitacion, double precio) {
        this.idhotel = idhotel;
        this.idhabitacion = idhabitacion;
        this.descripcionhotel = descripcionhotel;
        this.descripcionhabitacion = descripcionhabitacion;
        this.precio = precio;
    }

}
