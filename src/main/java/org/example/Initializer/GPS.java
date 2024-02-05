package org.example.Initializer;

import java.util.Objects;

public class GPS {
    private String direction;
    private int degree;

    public GPS(String direction, int degree) {
        this.direction = direction;
        this.degree = degree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GPS)) return false;
        GPS gps = (GPS) o;
        return getDegree() == gps.getDegree() && Objects.equals(getDirection(), gps.getDirection());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDirection(), getDegree());
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }
}
