
package com.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getAlbumByYear complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getAlbumByYear">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "getAlbumByYear", propOrder = {
    "year"
})
public class GetAlbumByYear {

    protected int year;

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
