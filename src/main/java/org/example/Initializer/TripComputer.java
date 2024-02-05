package org.example.Initializer;

import java.util.Objects;

public class TripComputer {
    private int currentFuel;
    private int maxFuel;
    private int minFuel;
    private int maxSpeed;
    private int minSpeed;
    private int currentSpeed;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TripComputer)) return false;
        TripComputer that = (TripComputer) o;
        return getCurrentFuel() == that.getCurrentFuel() && getMaxFuel() == that.getMaxFuel() && getMinFuel() == that.getMinFuel() && getMaxSpeed() == that.getMaxSpeed() && getMinSpeed() == that.getMinSpeed() && getCurrentSpeed() == that.getCurrentSpeed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCurrentFuel(), getMaxFuel(), getMinFuel(), getMaxSpeed(), getMinSpeed(), getCurrentSpeed());
    }

    public TripComputer(int currentFuel, int maxFuel, int minFuel, int maxSpeed, int minSpeed, int currentSpeed) {
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
        this.minFuel = minFuel;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(int currentFuel) {
        this.currentFuel = currentFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(int maxFuel) {
        this.maxFuel = maxFuel;
    }

    public int getMinFuel() {
        return minFuel;
    }

    public void setMinFuel(int minFuel) {
        this.minFuel = minFuel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public void setMinSpeed(int minSpeed) {
        this.minSpeed = minSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
