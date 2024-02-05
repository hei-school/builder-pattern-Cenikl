package org.example.Initializer;

import java.util.Objects;

public class Car {
    private Engine engine;
    private TripComputer tripComputer;
    private GPS GPS;
    private int seats;

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", tripComputer=" + tripComputer +
                ", GPS=" + GPS +
                ", seats=" + seats +
                '}';
    }

    public Car(Engine engine, TripComputer tripComputer, org.example.Initializer.GPS GPS, int seats) {
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.GPS = GPS;
        this.seats = seats;
    }

    public Car() {
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getSeats() == car.getSeats() && Objects.equals(getEngine(), car.getEngine()) && Objects.equals(getTripComputer(), car.getTripComputer()) && Objects.equals(getGPS(), car.getGPS());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEngine(), getTripComputer(), getGPS(), getSeats());
    }
}
