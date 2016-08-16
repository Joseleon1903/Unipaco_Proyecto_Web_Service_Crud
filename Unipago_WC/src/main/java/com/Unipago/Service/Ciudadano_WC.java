package com.Unipago.Service;

import Entity.EntidadCiudadano;
import com.Unipago.Bean.SessionBeanCiudadano;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

@WebService(serviceName = "Ciudadano_WC")
@Stateless()
public class Ciudadano_WC {

    private SessionBeanCiudadano beanCiudadano = new SessionBeanCiudadano();

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod
    public SessionBeanCiudadano getBeanSessionCiudadano() {
        return beanCiudadano;
    }

    @WebMethod
    public boolean AddCiudadano(@WebParam(name = "EntidadCiudadanoAdd")EntidadCiudadano ciudadano) {
        return beanCiudadano.AddCiudadano(ciudadano);
    }

    @WebMethod
    public boolean UpdateCiudadano(@WebParam(name = "EntidadCiudadanoUp")EntidadCiudadano ciudadano, int ID) {
        return beanCiudadano.UpdateCiudadano(ciudadano, ID);
    }

    @WebMethod
    public boolean DeleteCiudadano(@WebParam(name = "IDCiudadanoDel")int ID) {
        return beanCiudadano.DeleteCiudadano(ID);
    }

    @WebMethod
    public ArrayList<EntidadCiudadano> ListaCiudadano() {
        return beanCiudadano.ListaCiudadanos();
    }

    @WebMethod
    public EntidadCiudadano BuscarCiudadano(@WebParam(name = "IDCiudadanoSrc")int ID) {
        return beanCiudadano.BuscarCiudadano(ID);
    }

}
