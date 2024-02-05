package org.example.Builder;

import org.example.Initializer.Car;
import org.example.Initializer.Engine;
import org.example.Initializer.GPS;
import org.example.Initializer.TripComputer;
import org.example.Interface.BuilderInterface;

public class CarBuilder implements BuilderInterface {
  private Car car;

  public CarBuilder() {
    this.reset();
  }

  @Override
  public void reset() {
    this.car = new Car();
  }

  @Override
  public Engine setEngine(Engine engine) {
    car.setEngine(engine);
    return engine;
  }

  @Override
  public void setSeats(int numbers) {
    car.setSeats(numbers);
  }

  @Override
  public TripComputer setTripComputer(TripComputer computer) {
    car.setTripComputer(computer);
    return null;
  }

  @Override
  public GPS setGPS(GPS gps) {
    car.setGPS(gps);
    return gps;
  }

  public Car getResult() {
    return this.car;
  }
}
