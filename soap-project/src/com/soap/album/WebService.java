package com.soap.album;

import javax.xml.ws.Endpoint;

public class WebService {

    public static void main(String[] args) {
        Collection collection = new Collection();
        CollectionWS collectionWS = new CollectionWS(collection);

        Endpoint.publish("http://localhost:8080/albums", collectionWS);

        System.out.println("WebService running..." + "\n");
    }
}