/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Carlos
 */
@WebService(serviceName = "AgenciaViajes")
public class AgenciaViajes {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultar")
    public Hotel[] consultar(@WebParam(name = "fechainicio") String fechainicio, @WebParam(name = "fechafinal") String fechafinal, @WebParam(name = "nropersonas") int nropersonas) {
        //TODO write your implementation code here:
        Hotel aux=new Hotel(1,1,"Hotel Alasca","Habitacion Simple",50.6);
       
        return null;
    }

    /**
     * This is a sample web service operation
     */
  
}
