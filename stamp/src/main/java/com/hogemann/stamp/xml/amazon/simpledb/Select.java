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
 *         &lt;element name="SelectExpression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NextToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsistentRead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "selectExpression",
    "nextToken",
    "consistentRead"
})
@XmlRootElement(name = "Select", namespace = "http://sdb.amazonaws.com/doc/2009-04-15/")
public class Select {

    @XmlElement(name = "SelectExpression", namespace = "http://sdb.amazonaws.com/doc/2009-04-15/", required = true)
    protected String selectExpression;
    @XmlElement(name = "NextToken", namespace = "http://sdb.amazonaws.com/doc/2009-04-15/")
    protected String nextToken;
    @XmlElement(name = "ConsistentRead", namespace = "http://sdb.amazonaws.com/doc/2009-04-15/", defaultValue = "false")
    protected Boolean consistentRead;

    /**
     * Gets the value of the selectExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectExpression() {
        return selectExpression;
    }

    /**
     * Sets the value of the selectExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectExpression(String value) {
        this.selectExpression = value;
    }

    /**
     * Gets the value of the nextToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Sets the value of the nextToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextToken(String value) {
        this.nextToken = value;
    }

    /**
     * Gets the value of the consistentRead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsistentRead() {
        return consistentRead;
    }

    /**
     * Sets the value of the consistentRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsistentRead(Boolean value) {
        this.consistentRead = value;
    }

}