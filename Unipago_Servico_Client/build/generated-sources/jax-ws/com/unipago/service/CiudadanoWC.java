
package com.unipago.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Ciudadano_WC", targetNamespace = "http://Service.Unipago.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CiudadanoWC {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "AddCiudadano")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AddCiudadano", targetNamespace = "http://Service.Unipago.com/", className = "com.unipago.service.AddCiudadano")
    @ResponseWrapper(localName = "AddCiudadanoResponse", targetNamespace = "http://Service.Unipago.com/", className = "com.unipago.service.AddCiudadanoResponse")
    @Action(input = "http://Service.Unipago.com/Ciudadano_WC/AddCiudadanoRequest", output = "http://Service.Unipago.com/Ciudadano_WC/AddCiudadanoResponse")
    public boolean addCiudadano(
        @WebParam(name = "arg0", targetNamespace = "")
        EntidadCiudadano arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "UpdateCiudadano")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpdateCiudadano", targetNamespace = "http://Service.Unipago.com/", className = "com.unipago.service.UpdateCiudadano")
    @ResponseWrapper(localName = "UpdateCiudadanoResponse", targetNamespace = "http://Service.Unipago.com/", className = "com.unipago.service.UpdateCiudadanoResponse")
    @Action(input = "http://Service.Unipago.com/Ciudadano_WC/UpdateCiudadanoRequest", output = "http://Service.Unipago.com/Ciudadano_WC/UpdateCiudadanoResponse")
    public boolean updateCiudadano(
        @WebParam(name = "arg0", targetNamespace = "")
        EntidadCiudadano arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "DeleteCiudadano")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DeleteCiudadano", targetNamespace = "http://Service.Unipago.com/", className = "com.unipago.service.DeleteCiudadano")
    @ResponseWrapper(localName = "DeleteCiudadanoResponse", targetNamespace = "http://Service.Unipago.com/", className = "com.unipago.service.DeleteCiudadanoResponse")
    @Action(input = "http://Service.Unipago.com/Ciudadano_WC/DeleteCiudadanoRequest", output = "http://Service.Unipago.com/Ciudadano_WC/DeleteCiudadanoResponse")
    public boolean deleteCiudadano(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.unipago.service.EntidadCiudadano>
     */
    @WebMethod(operationName = "ListaCiudadano")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListaCiudadano", targetNamespace = "http://Service.Unipago.com/", className = "com.unipago.service.ListaCiudadano")
    @ResponseWrapper(localName = "ListaCiudadanoResponse", targetNamespace = "http://Service.Unipago.com/", className = "com.unipago.service.ListaCiudadanoResponse")
    @Action(input = "http://Service.Unipago.com/Ciudadano_WC/ListaCiudadanoRequest", output = "http://Service.Unipago.com/Ciudadano_WC/ListaCiudadanoResponse")
    public List<EntidadCiudadano> listaCiudadano();

    /**
     * 
     * @param arg0
     * @return
     *     returns com.unipago.service.EntidadCiudadano
     */
    @WebMethod(operationName = "BuscarCiudadano")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "BuscarCiudadano", targetNamespace = "http://Service.Unipago.com/", className = "com.unipago.service.BuscarCiudadano")
    @ResponseWrapper(localName = "BuscarCiudadanoResponse", targetNamespace = "http://Service.Unipago.com/", className = "com.unipago.service.BuscarCiudadanoResponse")
    @Action(input = "http://Service.Unipago.com/Ciudadano_WC/BuscarCiudadanoRequest", output = "http://Service.Unipago.com/Ciudadano_WC/BuscarCiudadanoResponse")
    public EntidadCiudadano buscarCiudadano(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://Service.Unipago.com/", className = "com.unipago.service.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://Service.Unipago.com/", className = "com.unipago.service.HelloResponse")
    @Action(input = "http://Service.Unipago.com/Ciudadano_WC/helloRequest", output = "http://Service.Unipago.com/Ciudadano_WC/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
