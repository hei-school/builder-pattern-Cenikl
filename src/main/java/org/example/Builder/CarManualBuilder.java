package org.example.Builder;

import org.example.Initializer.*;
import org.example.Interface.BuilderInterface;

public class CarManualBuilder implements BuilderInterface {
    private Manual carManual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.carManual = new Manual();
    }

    @Override
    public Engine setEngine(Engine engine) {
        carManual.setEngine(engine);
        return engine;
    }

    @Override
    public void setSeats(int numbers) {
        carManual.setSeats(numbers);
    }

    @Override
    public TripComputer setTripComputer(TripComputer tripComputer) {
        carManual.setTripComputer(tripComputer);
        return tripComputer;
    }

    @Override
    public GPS setGPS(GPS gps) {
        carManual.setGPS(gps);
        return null;
    }

    public Manual getResult(){
        return this.carManual;
    }
}
