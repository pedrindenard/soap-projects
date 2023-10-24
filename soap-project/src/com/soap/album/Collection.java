package com.soap.album;

import java.util.ArrayList;

public class Collection {

    ArrayList<Album> collection = new ArrayList<>();

    public void addAlbum(Album album) {
        collection.add(album);
    }

    public ArrayList<Album> getCollections() {
        return collection;
    }

    public Album getLastAlbum() {
        return collection.get(collection.size() - 1);
    }

}