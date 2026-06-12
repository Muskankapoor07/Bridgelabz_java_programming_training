package com.library.archive.factory;

import com.library.archive.model.*;

public class ArchiveItemFactory {

    public static ArchiveResource createResource(String type, String title) {

        if (type.equalsIgnoreCase("manuscript")) {
            return new Manuscript(title);
        }

        if (type.equalsIgnoreCase("map")) {
            return new HistoricalMap(title);
        }

        throw new IllegalArgumentException("Invalid Resource Type");
    }
}