package com.library.archive.model;

public class HistoricalMap implements ArchiveResource {

    private String title;

    public HistoricalMap(String title) {

        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}