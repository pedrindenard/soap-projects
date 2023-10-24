package com.soap.wsdl;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        CollectionWS client = getClientWithAlbums();

        ArrayList<Album> albumsByYears = (ArrayList<Album>) client.getAlbumByYear(1999);
        ArrayList<Album> albums = (ArrayList<Album>) client.getAlbums();

        System.out.println("Albums by years:");
        for (Album album : albumsByYears) {
            System.out.println("Name: " + album.name + ", Year: " + album.year + ", Product: " + album.products);
        }

        System.out.println("Albums:");
        for (Album album : albums) {
            System.out.println("Name: " + album.name + ", Year: " + album.year + ", Product: " + album.products);
        }
    }

    private static CollectionWS getClientWithAlbums() {
        CollectionWS client = new CollectionWSService().getCollectionWSPort();

        client.insertAlbum("Sinfonia das Estrelas", 1995, "Harmonia Universal Records");
        client.insertAlbum("Coração Roubado", 1997, "Melodia Mágica Productions");
        client.insertAlbum("Ecos do Silêncio", 2000, "Aurora Records");
        client.insertAlbum("Revolução dos Sonhos", 1999, "Visão Celestial Studios");
        client.insertAlbum("Caminhos do Vento", 2003, "Sons da Natureza Ltda.");
        client.insertAlbum("Alquimia do Tempo", 2005, "Magia Musical Inc.");
        client.insertAlbum("Espelhos da Alma", 1999, "Harmonia Universal Records");
        client.insertAlbum("Dança das Estrelas", 2008, "Estúdio Cósmico Productions");
        client.insertAlbum("Raios de Serenidade", 2012, "Mundo Místico Records");
        client.insertAlbum("Odisseia Lunar", 1999, "Cosmic Sounds Entertainment");

        return client;
    }
}