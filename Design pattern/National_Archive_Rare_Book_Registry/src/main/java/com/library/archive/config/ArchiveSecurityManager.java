package com.library.archive.config;

public class ArchiveSecurityManager {

    private static ArchiveSecurityManager instance;

    private ArchiveSecurityManager() {
    }

    public static ArchiveSecurityManager getInstance() {
        if (instance == null) {
            instance = new ArchiveSecurityManager();
        }
        return instance;
    }

    public String getSecurityClearanceLevel() {
        return "LEVEL-4-RESTRICTED";
    }
}