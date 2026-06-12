package com.library.archive.observe;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<CuratorObserver> observers =
            new ArrayList<>();

    public void registerObserver(
            CuratorObserver observer) {

        observers.add(observer);
    }

    public void triggerClimateAlert(
            String alert) {

        String message =
                "Climate Warning: " + alert;

        for (CuratorObserver observer : observers) {
            observer.update(message);
        }
    }
}