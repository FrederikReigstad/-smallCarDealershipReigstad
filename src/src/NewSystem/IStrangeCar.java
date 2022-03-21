package NewSystem;

import java.time.LocalDateTime;

public interface IStrangeCar {

    public String getLicense(); // return license plate number

    public String getCountry();  // returns country of origin

    public LocalDateTime getFactoryDate(); // the LocalDateTime of production date

    public float getPriceInDKK(); // returns price in danish kroners
}
