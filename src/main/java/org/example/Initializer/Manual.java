package org.example.Initializer;

import java.util.Objects;

public class Manual {
    private Engine engine;
    private TripComputer TripComputer;
    private GPS GPS;
    private int seats;

    public Manual() {
    }

    @Override
    public String toString() {
        return "Manual{" +
                "engine=" + engine +
                ", TripComputer=" + TripComputer +
                ", GPS=" + GPS +
                ", seats=" + seats +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manual)) return false;
        Manual manual = (Manual) o;
        return getSeats() == manual.getSeats() && Objects.equals(getEngine(), manual.getEngine()) && Objects.equals(getTripComputer(), manual.getTripComputer()) && Objects.equals(getGPS(), manual.getGPS());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEngine(), getTripComputer(), getGPS(), getSeats());
    }

    public Manual(Engine engine, org.example.Initializer.TripComputer tripComputer, org.example.Initializer.GPS GPS, int seats) {
        this.engine = engine;
        TripComputer = tripComputer;
        this.GPS = GPS;
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public org.example.Initializer.TripComputer getTripComputer() {
        return TripComputer;
    }

    public void setTripComputer(org.example.Initializer.TripComputer tripComputer) {
        TripComputer = tripComputer;
    }

    public org.example.Initializer.GPS getGPS() {
        return GPS;
    }

    public void setGPS(org.example.Initializer.GPS GPS) {
        this.GPS = GPS;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
