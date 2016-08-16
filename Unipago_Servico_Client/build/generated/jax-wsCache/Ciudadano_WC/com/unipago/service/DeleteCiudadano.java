
package com.unipago.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteCiudadano complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteCiudadano"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDCiudadanoDel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteCiudadano", propOrder = {
    "idCiudadanoDel"
})
public class DeleteCiudadano {

    @XmlElement(name = "IDCiudadanoDel")
    protected int idCiudadanoDel;

    /**
     * Gets the value of the idCiudadanoDel property.
     * 
     */
    public int getIDCiudadanoDel() {
        return idCiudadanoDel;
    }

    /**
     * Sets the value of the idCiudadanoDel property.
     * 
     */
    public void setIDCiudadanoDel(int value) {
        this.idCiudadanoDel = value;
    }

}
