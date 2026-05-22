package DSA;

import java.util.*;

public class RecentlyVisitedStations {
    Stack<String> stationStack = new Stack<>();

    void addStation(String station) {
        stationStack.push(station);
        System.out.println(station + " add ");
    }

    void undoStation() {
        if (stationStack.isEmpty()) {
            System.out.println(" No station history found ");
        } else {
            System.out.println(stationStack.pop() + " removed ");
        }
    }

    void displayHistory() {
        System.out.println("Station History: " + stationStack);
    }

    public static void main(String[] args) {
        RecentlyVisitedStations rv = new RecentlyVisitedStations();
        rv.addStation("Sikandra");
        rv.addStation("MG road");
        rv.addStation("CP");
        rv.undoStation();
        rv.displayHistory();
    }
}
