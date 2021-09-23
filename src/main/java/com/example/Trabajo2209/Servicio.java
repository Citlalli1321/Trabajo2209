package com.example.Trabajo2209;

import sun.rmi.transport.Endpoint;

@WebService(name="Servicio", targetNamespace="utez")
@SOAPBinding(style=SOAPBinding.Style.RPC)

public class Servicio {
    @WebMethod( operationName="DevuelveMensaje" )
    public String devuelveMensaje(@WebParam String valor ){
        return "Hola" + valor;
    }
    public static void main( String[] args ){
        Endpoint.publish( "http://localhost:7777/Servicio", new Servicio( ) );
    }
}
