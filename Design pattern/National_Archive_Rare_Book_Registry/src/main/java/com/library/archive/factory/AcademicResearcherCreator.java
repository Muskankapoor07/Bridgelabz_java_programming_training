package com.library.archive.factory;

public class AcademicResearcherCreator extends ResearcherCreator {

    @Override
    public Researcher createResearcher() {
        return new AcademicResearcher();
    }
}