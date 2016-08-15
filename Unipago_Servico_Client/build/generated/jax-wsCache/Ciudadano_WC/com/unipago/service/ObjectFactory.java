
package com.unipago.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.unipago.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddCiudadano_QNAME = new QName("http://Service.Unipago.com/", "AddCiudadano");
    private final static QName _AddCiudadanoResponse_QNAME = new QName("http://Service.Unipago.com/", "AddCiudadanoResponse");
    private final static QName _BuscarCiudadano_QNAME = new QName("http://Service.Unipago.com/", "BuscarCiudadano");
    private final static QName _BuscarCiudadanoResponse_QNAME = new QName("http://Service.Unipago.com/", "BuscarCiudadanoResponse");
    private final static QName _DeleteCiudadano_QNAME = new QName("http://Service.Unipago.com/", "DeleteCiudadano");
    private final static QName _DeleteCiudadanoResponse_QNAME = new QName("http://Service.Unipago.com/", "DeleteCiudadanoResponse");
    private final static QName _ListaCiudadano_QNAME = new QName("http://Service.Unipago.com/", "ListaCiudadano");
    private final static QName _ListaCiudadanoResponse_QNAME = new QName("http://Service.Unipago.com/", "ListaCiudadanoResponse");
    private final static QName _UpdateCiudadano_QNAME = new QName("http://Service.Unipago.com/", "UpdateCiudadano");
    private final static QName _UpdateCiudadanoResponse_QNAME = new QName("http://Service.Unipago.com/", "UpdateCiudadanoResponse");
    private final static QName _Hello_QNAME = new QName("http://Service.Unipago.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://Service.Unipago.com/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unipago.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCiudadano }
     * 
     */
    public AddCiudadano createAddCiudadano() {
        return new AddCiudadano();
    }

    /**
     * Create an instance of {@link AddCiudadanoResponse }
     * 
     */
    public AddCiudadanoResponse createAddCiudadanoResponse() {
        return new AddCiudadanoResponse();
    }

    /**
     * Create an instance of {@link BuscarCiudadano }
     * 
     */
    public BuscarCiudadano createBuscarCiudadano() {
        return new BuscarCiudadano();
    }

    /**
     * Create an instance of {@link BuscarCiudadanoResponse }
     * 
     */
    public BuscarCiudadanoResponse createBuscarCiudadanoResponse() {
        return new BuscarCiudadanoResponse();
    }

    /**
     * Create an instance of {@link DeleteCiudadano }
     * 
     */
    public DeleteCiudadano createDeleteCiudadano() {
        return new DeleteCiudadano();
    }

    /**
     * Create an instance of {@link DeleteCiudadanoResponse }
     * 
     */
    public DeleteCiudadanoResponse createDeleteCiudadanoResponse() {
        return new DeleteCiudadanoResponse();
    }

    /**
     * Create an instance of {@link ListaCiudadano }
     * 
     */
    public ListaCiudadano createListaCiudadano() {
        return new ListaCiudadano();
    }

    /**
     * Create an instance of {@link ListaCiudadanoResponse }
     * 
     */
    public ListaCiudadanoResponse createListaCiudadanoResponse() {
        return new ListaCiudadanoResponse();
    }

    /**
     * Create an instance of {@link UpdateCiudadano }
     * 
     */
    public UpdateCiudadano createUpdateCiudadano() {
        return new UpdateCiudadano();
    }

    /**
     * Create an instance of {@link UpdateCiudadanoResponse }
     * 
     */
    public UpdateCiudadanoResponse createUpdateCiudadanoResponse() {
        return new UpdateCiudadanoResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link EntidadCiudadano }
     * 
     */
    public EntidadCiudadano createEntidadCiudadano() {
        return new EntidadCiudadano();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCiudadano }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.Unipago.com/", name = "AddCiudadano")
    public JAXBElement<AddCiudadano> createAddCiudadano(AddCiudadano value) {
        return new JAXBElement<AddCiudadano>(_AddCiudadano_QNAME, AddCiudadano.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCiudadanoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.Unipago.com/", name = "AddCiudadanoResponse")
    public JAXBElement<AddCiudadanoResponse> createAddCiudadanoResponse(AddCiudadanoResponse value) {
        return new JAXBElement<AddCiudadanoResponse>(_AddCiudadanoResponse_QNAME, AddCiudadanoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCiudadano }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.Unipago.com/", name = "BuscarCiudadano")
    public JAXBElement<BuscarCiudadano> createBuscarCiudadano(BuscarCiudadano value) {
        return new JAXBElement<BuscarCiudadano>(_BuscarCiudadano_QNAME, BuscarCiudadano.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCiudadanoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.Unipago.com/", name = "BuscarCiudadanoResponse")
    public JAXBElement<BuscarCiudadanoResponse> createBuscarCiudadanoResponse(BuscarCiudadanoResponse value) {
        return new JAXBElement<BuscarCiudadanoResponse>(_BuscarCiudadanoResponse_QNAME, BuscarCiudadanoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCiudadano }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.Unipago.com/", name = "DeleteCiudadano")
    public JAXBElement<DeleteCiudadano> createDeleteCiudadano(DeleteCiudadano value) {
        return new JAXBElement<DeleteCiudadano>(_DeleteCiudadano_QNAME, DeleteCiudadano.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCiudadanoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.Unipago.com/", name = "DeleteCiudadanoResponse")
    public JAXBElement<DeleteCiudadanoResponse> createDeleteCiudadanoResponse(DeleteCiudadanoResponse value) {
        return new JAXBElement<DeleteCiudadanoResponse>(_DeleteCiudadanoResponse_QNAME, DeleteCiudadanoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaCiudadano }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.Unipago.com/", name = "ListaCiudadano")
    public JAXBElement<ListaCiudadano> createListaCiudadano(ListaCiudadano value) {
        return new JAXBElement<ListaCiudadano>(_ListaCiudadano_QNAME, ListaCiudadano.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaCiudadanoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.Unipago.com/", name = "ListaCiudadanoResponse")
    public JAXBElement<ListaCiudadanoResponse> createListaCiudadanoResponse(ListaCiudadanoResponse value) {
        return new JAXBElement<ListaCiudadanoResponse>(_ListaCiudadanoResponse_QNAME, ListaCiudadanoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCiudadano }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.Unipago.com/", name = "UpdateCiudadano")
    public JAXBElement<UpdateCiudadano> createUpdateCiudadano(UpdateCiudadano value) {
        return new JAXBElement<UpdateCiudadano>(_UpdateCiudadano_QNAME, UpdateCiudadano.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCiudadanoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.Unipago.com/", name = "UpdateCiudadanoResponse")
    public JAXBElement<UpdateCiudadanoResponse> createUpdateCiudadanoResponse(UpdateCiudadanoResponse value) {
        return new JAXBElement<UpdateCiudadanoResponse>(_UpdateCiudadanoResponse_QNAME, UpdateCiudadanoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.Unipago.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.Unipago.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
