
package com.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de insertAlbumResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="insertAlbumResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="album" type="{http://album.soap.com/}album" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertAlbumResponse", propOrder = {
    "album"
})
public class InsertAlbumResponse {

    protected Album album;

    /**
     * Obtém o valor da propriedade album.
     * 
     * @return
     *     possible object is
     *     {@link Album }
     *     
     */
    public Album getAlbum() {
        return album;
    }

    /**
     * Define o valor da propriedade album.
     * 
     * @param value
     *     allowed object is
     *     {@link Album }
     *     
     */
    public void setAlbum(Album value) {
        this.album = value;
    }

}
