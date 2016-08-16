
package com.unipago.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCiudadano complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCiudadano"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntidadCiudadanoAdd" type="{http://Service.Unipago.com/}entidadCiudadano" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCiudadano", propOrder = {
    "entidadCiudadanoAdd"
})
public class AddCiudadano {

    @XmlElement(name = "EntidadCiudadanoAdd")
    protected EntidadCiudadano entidadCiudadanoAdd;

    /**
     * Gets the value of the entidadCiudadanoAdd property.
     * 
     * @return
     *     possible object is
     *     {@link EntidadCiudadano }
     *     
     */
    public EntidadCiudadano getEntidadCiudadanoAdd() {
        return entidadCiudadanoAdd;
    }

    /**
     * Sets the value of the entidadCiudadanoAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadCiudadano }
     *     
     */
    public void setEntidadCiudadanoAdd(EntidadCiudadano value) {
        this.entidadCiudadanoAdd = value;
    }

}
