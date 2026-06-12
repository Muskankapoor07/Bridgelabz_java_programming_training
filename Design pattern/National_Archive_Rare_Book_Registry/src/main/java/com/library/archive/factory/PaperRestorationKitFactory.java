package com.library.archive.factory;

public class PaperRestorationKitFactory
        implements PreservationKitFactory {

    @Override
    public String createGloves() {
        return "Nitrile";
    }

    @Override
    public String createBufferSolution() {
        return "AcidFree";
    }
}