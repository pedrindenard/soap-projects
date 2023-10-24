
package com.soap.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsertAlbum_QNAME = new QName("http://album.soap.com/", "insertAlbum");
    private final static QName _GetAlbumsResponse_QNAME = new QName("http://album.soap.com/", "getAlbumsResponse");
    private final static QName _GetAlbumsTitleResponse_QNAME = new QName("http://album.soap.com/", "getAlbumsTitleResponse");
    private final static QName _InsertAlbumResponse_QNAME = new QName("http://album.soap.com/", "insertAlbumResponse");
    private final static QName _GetAlbumByYearResponse_QNAME = new QName("http://album.soap.com/", "getAlbumByYearResponse");
    private final static QName _GetAlbumByYear_QNAME = new QName("http://album.soap.com/", "getAlbumByYear");
    private final static QName _GetAlbumsTitle_QNAME = new QName("http://album.soap.com/", "getAlbumsTitle");
    private final static QName _GetAlbums_QNAME = new QName("http://album.soap.com/", "getAlbums");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAlbumByYearResponse }
     * 
     */
    public GetAlbumByYearResponse createGetAlbumByYearResponse() {
        return new GetAlbumByYearResponse();
    }

    /**
     * Create an instance of {@link GetAlbumByYear }
     * 
     */
    public GetAlbumByYear createGetAlbumByYear() {
        return new GetAlbumByYear();
    }

    /**
     * Create an instance of {@link GetAlbumsTitle }
     * 
     */
    public GetAlbumsTitle createGetAlbumsTitle() {
        return new GetAlbumsTitle();
    }

    /**
     * Create an instance of {@link GetAlbums }
     * 
     */
    public GetAlbums createGetAlbums() {
        return new GetAlbums();
    }

    /**
     * Create an instance of {@link GetAlbumsResponse }
     * 
     */
    public GetAlbumsResponse createGetAlbumsResponse() {
        return new GetAlbumsResponse();
    }

    /**
     * Create an instance of {@link InsertAlbum }
     * 
     */
    public InsertAlbum createInsertAlbum() {
        return new InsertAlbum();
    }

    /**
     * Create an instance of {@link GetAlbumsTitleResponse }
     * 
     */
    public GetAlbumsTitleResponse createGetAlbumsTitleResponse() {
        return new GetAlbumsTitleResponse();
    }

    /**
     * Create an instance of {@link InsertAlbumResponse }
     * 
     */
    public InsertAlbumResponse createInsertAlbumResponse() {
        return new InsertAlbumResponse();
    }

    /**
     * Create an instance of {@link Album }
     * 
     */
    public Album createAlbum() {
        return new Album();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertAlbum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://album.soap.com/", name = "insertAlbum")
    public JAXBElement<InsertAlbum> createInsertAlbum(InsertAlbum value) {
        return new JAXBElement<InsertAlbum>(_InsertAlbum_QNAME, InsertAlbum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlbumsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://album.soap.com/", name = "getAlbumsResponse")
    public JAXBElement<GetAlbumsResponse> createGetAlbumsResponse(GetAlbumsResponse value) {
        return new JAXBElement<GetAlbumsResponse>(_GetAlbumsResponse_QNAME, GetAlbumsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlbumsTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://album.soap.com/", name = "getAlbumsTitleResponse")
    public JAXBElement<GetAlbumsTitleResponse> createGetAlbumsTitleResponse(GetAlbumsTitleResponse value) {
        return new JAXBElement<GetAlbumsTitleResponse>(_GetAlbumsTitleResponse_QNAME, GetAlbumsTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertAlbumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://album.soap.com/", name = "insertAlbumResponse")
    public JAXBElement<InsertAlbumResponse> createInsertAlbumResponse(InsertAlbumResponse value) {
        return new JAXBElement<InsertAlbumResponse>(_InsertAlbumResponse_QNAME, InsertAlbumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlbumByYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://album.soap.com/", name = "getAlbumByYearResponse")
    public JAXBElement<GetAlbumByYearResponse> createGetAlbumByYearResponse(GetAlbumByYearResponse value) {
        return new JAXBElement<GetAlbumByYearResponse>(_GetAlbumByYearResponse_QNAME, GetAlbumByYearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlbumByYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://album.soap.com/", name = "getAlbumByYear")
    public JAXBElement<GetAlbumByYear> createGetAlbumByYear(GetAlbumByYear value) {
        return new JAXBElement<GetAlbumByYear>(_GetAlbumByYear_QNAME, GetAlbumByYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlbumsTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://album.soap.com/", name = "getAlbumsTitle")
    public JAXBElement<GetAlbumsTitle> createGetAlbumsTitle(GetAlbumsTitle value) {
        return new JAXBElement<GetAlbumsTitle>(_GetAlbumsTitle_QNAME, GetAlbumsTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlbums }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://album.soap.com/", name = "getAlbums")
    public JAXBElement<GetAlbums> createGetAlbums(GetAlbums value) {
        return new JAXBElement<GetAlbums>(_GetAlbums_QNAME, GetAlbums.class, null, value);
    }

}
