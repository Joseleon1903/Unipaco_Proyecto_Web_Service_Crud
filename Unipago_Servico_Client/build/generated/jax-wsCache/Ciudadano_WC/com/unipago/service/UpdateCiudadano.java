
package com.unipago.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCiudadano complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCiudadano"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntidadCiudadanoUp" type="{http://Service.Unipago.com/}entidadCiudadano" minOccurs="0"/&gt;
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCiudadano", propOrder = {
    "entidadCiudadanoUp",
    "arg1"
})
public class UpdateCiudadano {

    @XmlElement(name = "EntidadCiudadanoUp")
    protected EntidadCiudadano entidadCiudadanoUp;
    protected int arg1;

    /**
     * Gets the value of the entidadCiudadanoUp property.
     * 
     * @return
     *     possible object is
     *     {@link EntidadCiudadano }
     *     
     */
    public EntidadCiudadano getEntidadCiudadanoUp() {
        return entidadCiudadanoUp;
    }

    /**
     * Sets the value of the entidadCiudadanoUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadCiudadano }
     *     
     */
    public void setEntidadCiudadanoUp(EntidadCiudadano value) {
        this.entidadCiudadanoUp = value;
    }

    /**
     * Gets the value of the arg1 property.
     * 
     */
    public int getArg1() {
        return arg1;
    }

    /**
     * Sets the value of the arg1 property.
     * 
     */
    public void setArg1(int value) {
        this.arg1 = value;
    }

}
