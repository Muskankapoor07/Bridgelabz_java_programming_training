package com.library.archive.decorator;

public class InsuranceCoverDecorator implements InspectionCost {

    private InspectionCost inspectionCost;

    public InsuranceCoverDecorator(
            InspectionCost inspectionCost) {

        this.inspectionCost = inspectionCost;
    }

    @Override
    public double getCost() {
        return inspectionCost.getCost() + 50.0;
    }
}