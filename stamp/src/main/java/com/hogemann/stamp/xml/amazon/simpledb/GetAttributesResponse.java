//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.31 at 10:07:36 PM BRT 
//


package com.hogemann.stamp.xml.amazon.simpledb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://sdb.amazonaws.com/doc/2009-04-15/}GetAttributesResult"/>
 *         &lt;element ref="{http://sdb.amazonaws.com/doc/2009-04-15/}ResponseMetadata"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAttributesResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetAttributesResponse", namespace = "http://sdb.amazonaws.com/doc/2009-04-15/")
public class GetAttributesResponse {

    @XmlElement(name = "GetAttributesResult", namespace = "http://sdb.amazonaws.com/doc/2009-04-15/", required = true)
    protected GetAttributesResult getAttributesResult;
    @XmlElement(name = "ResponseMetadata", namespace = "http://sdb.amazonaws.com/doc/2009-04-15/", required = true)
    protected ResponseMetadata responseMetadata;

    /**
     * Gets the value of the getAttributesResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetAttributesResult }
     *     
     */
    public GetAttributesResult getGetAttributesResult() {
        return getAttributesResult;
    }

    /**
     * Sets the value of the getAttributesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAttributesResult }
     *     
     */
    public void setGetAttributesResult(GetAttributesResult value) {
        this.getAttributesResult = value;
    }

    /**
     * Gets the value of the responseMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMetadata }
     *     
     */
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Sets the value of the responseMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMetadata }
     *     
     */
    public void setResponseMetadata(ResponseMetadata value) {
        this.responseMetadata = value;
    }

}