package com.soap.album;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.ArrayList;

@WebService
public class CollectionWS {

    Collection collection;

    public CollectionWS(Collection collection) {
        this.collection = collection;
    }

    @WebResult(name = "album")
    public Album insertAlbum(
        @WebParam(name = "name") String name,
        @WebParam(name = "year") int year,
        @WebParam(name = "product") String product
    ) {
        collection.addAlbum(new Album(name, product, year));
        System.out.println("Album added: " + name);
        return collection.getLastAlbum();
    }

    @WebResult(name = "albumTitle")
    public ArrayList<String> getAlbumsTitle() {
        ArrayList<String> albumsTitle = new ArrayList<>();

        for (Album album : collection.getCollections()) {
            albumsTitle.add(album.getName());
        }

        System.out.println("Albums get by title");
        return albumsTitle;
    }

    @WebResult(name = "album")
    public ArrayList<Album> getAlbums() {
        System.out.println("Albums get by full information");
        return collection.getCollections();
    }

    @WebResult(name = "album")
    public ArrayList<Album> getAlbumByYear(
        @WebParam(name = "year") int year
    ) {
        ArrayList<Album> albumsByYear = new ArrayList<>();

        for (Album album : collection.getCollections()) {
            if (album.getYear() == year) {
                albumsByYear.add(album);
            }
        }

        System.out.println("Albums get by year");
        return albumsByYear;
    }
}