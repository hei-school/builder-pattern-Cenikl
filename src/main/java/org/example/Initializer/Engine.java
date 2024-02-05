package org.example.Initializer;


import java.util.Objects;

public class Engine {
    private String nom;
    private Integer power;

    public Engine(String nom, Integer power) {
        this.nom = nom;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        Engine engine = (Engine) o;
        return Objects.equals(getNom(), engine.getNom()) && Objects.equals(getPower(), engine.getPower());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getPower());
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }
}
