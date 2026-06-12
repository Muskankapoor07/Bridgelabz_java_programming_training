package com.library.archive.factory;

public class GuestHistorianCreator extends ResearcherCreator {

    @Override
    public Researcher createResearcher() {
        return new GuestHistorian();
    }
}