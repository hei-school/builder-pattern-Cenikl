package org.example.Initializer;

import org.example.Interface.BuilderInterface;

public class Director {

    public BuilderInterface makeSUV(BuilderInterface builder){
        builder.reset();
        builder.setSeats(4);
        builder.setEngine(new Engine("V8",1000));
        builder.setTripComputer(new TripComputer(25,15,0,200,0,0));
        builder.setGPS(new GPS("None",0));
        return builder;
    };

    public BuilderInterface makeSportsCar(BuilderInterface builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new Engine("V10",2000));
        builder.setTripComputer(new TripComputer(20,20,0,300,0,0));
        builder.setGPS(new GPS("None",0));
        return builder;
    }
}
