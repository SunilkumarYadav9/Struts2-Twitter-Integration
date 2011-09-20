//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.31 at 10:07:36 PM BRT 
//


package com.hogemann.stamp.xml.amazon.simpledb;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="DomainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attribute" type="{http://sdb.amazonaws.com/doc/2009-04-15/}ReplaceableAttribute" maxOccurs="unbounded"/>
 *         &lt;element name="Expected" type="{http://sdb.amazonaws.com/doc/2009-04-15/}UpdateCondition" minOccurs="0"/>
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
    "domainName",
    "itemName",
    "attribute",
    "expected"
})
@XmlRootElement(name = "PutAttributes", namespace = "http://sdb.amazonaws.com/doc/2009-04-15/")
public class PutAttributes {

    @XmlElement(name = "DomainName", namespace = "http://sdb.amazonaws.com/doc/2009-04-15/", required = true)
    protected String domainName;
    @XmlElement(name = "ItemName", namespace = "http://sdb.amazonaws.com/doc/2009-04-15/", required = true)
    protected String itemName;
    @XmlElement(name = "Attribute", namespace = "http://sdb.amazonaws.com/doc/2009-04-15/", required = true)
    protected List<ReplaceableAttribute> attribute;
    @XmlElement(name = "Expected", namespace = "http://sdb.amazonaws.com/doc/2009-04-15/")
    protected UpdateCondition expected;

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReplaceableAttribute }
     * 
     * 
     */
    public List<ReplaceableAttribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<ReplaceableAttribute>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the expected property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateCondition }
     *     
     */
    public UpdateCondition getExpected() {
        return expected;
    }

    /**
     * Sets the value of the expected property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateCondition }
     *     
     */
    public void setExpected(UpdateCondition value) {
        this.expected = value;
    }

}
