import NewSystem.IStrangeCar;
import NewSystem.StrangeCar;
import TransportCategories.Car;
import TransportCategories.CarFactory;
import TransportCategories.ICar;
import TransportCategories.StrangeCarAdapptor;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ICar car = new Car(2005, 2400, "BV21069", "Pegoet", "308");
        IStrangeCar car1 = new StrangeCar("cu56210", "Dennemark", LocalDateTime.now(), 3499);
        ICar car3 = CarFactory.createCar(2003,21000, "DH21798","BMW","DCH","Car");
        ICar car4 = CarFactory.createCar(2003,21000, "DH21798","BMW","DCH","StrangeCar");

        ArrayList<ICar> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car3);
        cars.add(car4);

        ICar car2 = new StrangeCarAdapptor(car1);
        cars.add(car2);

        System.out.println(cars);


    }

}

