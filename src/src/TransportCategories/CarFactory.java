package TransportCategories;

import NewSystem.StrangeCar;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class CarFactory {


    public static ICar createCar( int year, double price, String licensePlate, String make, String model,String carType){
        if (carType.equals("Car"))
            return new Car( year,  price,  licensePlate,  make,  model);


        else if (carType.equals("StrangeCar")) {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            return new StrangeCarAdapptor(
            new StrangeCar(licensePlate, null, LocalDateTime.of(year,
                    Month.JULY, 1, 1, 1, 1), (float) price));
        }
        else return null;
    }



}
