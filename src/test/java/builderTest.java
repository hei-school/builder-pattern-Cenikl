import org.example.Builder.CarBuilder;
import org.example.Builder.CarManualBuilder;
import org.example.Initializer.Car;
import org.example.Initializer.Director;
import org.example.Initializer.Engine;
import org.example.Initializer.GPS;
import org.example.Initializer.Manual;
import org.example.Initializer.TripComputer;
import org.example.Interface.BuilderInterface;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class builderTest {


    @Test
    public void makeSuvTest(){
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.makeSUV(carBuilder);
        Car car = carBuilder.getResult();

        assertTrue(carBuilder instanceof BuilderInterface);
        assertEquals(car.toString(),carBuilder.getResult().toString());
        assertEquals(4,car.getSeats());
        assertEquals(new Engine("V8",1000),car.getEngine());
        assertEquals(new TripComputer(25,15,0,200,0,0),car.getTripComputer());
        assertEquals(new GPS("None",0),car.getGPS());
    }

    @Test
    public void makeSportsCarsTest(){
        Director director = new Director();
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.makeSportsCar(carManualBuilder);
        Manual manual = carManualBuilder.getResult();

        assertTrue(carManualBuilder instanceof  BuilderInterface);
        assertEquals(manual.toString(),carManualBuilder.getResult().toString());
        assertEquals(2,manual.getSeats());
        assertEquals(new Engine("V10",2000),manual.getEngine());
        assertEquals(new TripComputer(20,20,0,300,0,0),manual.getTripComputer());
        assertEquals(new GPS("None",0),manual.getGPS());
    }
}
