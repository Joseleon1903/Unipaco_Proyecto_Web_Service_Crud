
package com.unipago.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Ciudadano_WC", targetNamespace = "http://Service.Unipago.com/", wsdlLocation = "http://localhost:8080/Ciudadano_WC/Ciudadano_WC?wsdl")
public class CiudadanoWC_Service
    extends Service
{

    private final static URL CIUDADANOWC_WSDL_LOCATION;
    private final static WebServiceException CIUDADANOWC_EXCEPTION;
    private final static QName CIUDADANOWC_QNAME = new QName("http://Service.Unipago.com/", "Ciudadano_WC");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Ciudadano_WC/Ciudadano_WC?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CIUDADANOWC_WSDL_LOCATION = url;
        CIUDADANOWC_EXCEPTION = e;
    }

    public CiudadanoWC_Service() {
        super(__getWsdlLocation(), CIUDADANOWC_QNAME);
    }

    public CiudadanoWC_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CIUDADANOWC_QNAME, features);
    }

    public CiudadanoWC_Service(URL wsdlLocation) {
        super(wsdlLocation, CIUDADANOWC_QNAME);
    }

    public CiudadanoWC_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CIUDADANOWC_QNAME, features);
    }

    public CiudadanoWC_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CiudadanoWC_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CiudadanoWC
     */
    @WebEndpoint(name = "Ciudadano_WCPort")
    public CiudadanoWC getCiudadanoWCPort() {
        return super.getPort(new QName("http://Service.Unipago.com/", "Ciudadano_WCPort"), CiudadanoWC.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CiudadanoWC
     */
    @WebEndpoint(name = "Ciudadano_WCPort")
    public CiudadanoWC getCiudadanoWCPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Service.Unipago.com/", "Ciudadano_WCPort"), CiudadanoWC.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CIUDADANOWC_EXCEPTION!= null) {
            throw CIUDADANOWC_EXCEPTION;
        }
        return CIUDADANOWC_WSDL_LOCATION;
    }

}