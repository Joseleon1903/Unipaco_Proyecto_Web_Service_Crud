
package com.unipago.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuscarCiudadano complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuscarCiudadano"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDCiudadanoSrc" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscarCiudadano", propOrder = {
    "idCiudadanoSrc"
})
public class BuscarCiudadano {

    @XmlElement(name = "IDCiudadanoSrc")
    protected int idCiudadanoSrc;

    /**
     * Gets the value of the idCiudadanoSrc property.
     * 
     */
    public int getIDCiudadanoSrc() {
        return idCiudadanoSrc;
    }

    /**
     * Sets the value of the idCiudadanoSrc property.
     * 
     */
    public void setIDCiudadanoSrc(int value) {
        this.idCiudadanoSrc = value;
    }

}
