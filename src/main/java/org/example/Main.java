package org.example;

import org.example.Builder.CarBuilder;
import org.example.Builder.CarManualBuilder;
import org.example.Initializer.Car;
import org.example.Initializer.Director;
import org.example.Initializer.Manual;

public class Main {
  public static void main(String[] args) {
    Director director = new Director();

    CarBuilder carBuilder = new CarBuilder();
    director.makeSportsCar(carBuilder);
    Car car = carBuilder.getResult();

    CarManualBuilder carManualBuilder = new CarManualBuilder();
    director.makeSUV(carManualBuilder);
    Manual carManual = carManualBuilder.getResult();

    System.out.println(car.toString());
  }
}
