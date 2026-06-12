package com.library.archive.model;

public class Manuscript implements ArchiveResource {

    private String title;

    public Manuscript(String title) {

        this.title = title;
    }

    @Override
    public String getTitle() {

        return title;
    }
}