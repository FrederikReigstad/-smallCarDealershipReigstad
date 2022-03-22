import NewSystem.IStrangeCar;
import NewSystem.StrangeCar;
import TransportCategories.Car;
import TransportCategories.ICar;
import TransportCategories.StrangeCarAdapptor;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ICar car = new Car(2005, 2400, "BV21069", "Pegoet", "308");
        IStrangeCar car1 = new StrangeCar("cu56210", "Dennemark", LocalDateTime.now(), 3499);

        ArrayList<ICar> cars = new ArrayList<>();
        cars.add(car);
        ICar car2 = new StrangeCarAdapptor(car1);
        cars.add(car2);

        System.out.println(car.toString());
        System.out.println(car2.toString());

    }

}

