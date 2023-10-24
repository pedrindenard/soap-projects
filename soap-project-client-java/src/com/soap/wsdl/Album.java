
package com.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de album complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="album">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="products" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "album", propOrder = {
    "name",
    "products",
    "year"
})
public class Album {

    protected String name;
    protected String products;
    protected int year;

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade products.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducts() {
        return products;
    }

    /**
     * Define o valor da propriedade products.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducts(String value) {
        this.products = value;
    }

    /**
     * Obtém o valor da propriedade year.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Define o valor da propriedade year.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
