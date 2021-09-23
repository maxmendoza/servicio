package com.example.actividad.servicio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(name="Servicio",targetNamespace = "utez")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class Servicio {
    @WebMethod(operationName ="devuelveMensaje")
    public String devuelveMensaje(@WebParam String valor){
        return "hola"+valor;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:7777/Servicio",new Servicio());
    }
}
