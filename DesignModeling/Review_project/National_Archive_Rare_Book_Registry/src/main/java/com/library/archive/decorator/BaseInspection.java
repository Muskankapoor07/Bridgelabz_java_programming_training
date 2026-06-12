package com.library.archive.decorator;

public class BaseInspection implements InspectionCost {

    @Override
    public double getCost() {
        return 10.0;
    }
}