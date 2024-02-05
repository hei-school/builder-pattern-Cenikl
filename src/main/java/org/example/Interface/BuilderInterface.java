package org.example.Interface;

import org.example.Initializer.Engine;
import org.example.Initializer.GPS;
import org.example.Initializer.TripComputer;

public interface BuilderInterface {
    void reset();
    Engine setEngine(Engine engine);
    void setSeats(int numbers);
    TripComputer setTripComputer(TripComputer tripComputer);
    GPS setGPS(GPS gps);
}
