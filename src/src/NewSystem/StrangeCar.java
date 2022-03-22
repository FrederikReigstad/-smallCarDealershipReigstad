package NewSystem;

import java.time.LocalDateTime;

public class StrangeCar implements IStrangeCar {
    private String leicense;
    private String country;
    private LocalDateTime factoryData;
    private float priceInDKK;

    public StrangeCar(String leicense, String country, LocalDateTime factoryData, float priceInDKK) {
        this.leicense = leicense;
        this.country = country;
        this.factoryData = factoryData;
        this.priceInDKK = priceInDKK;
    }

    public String getLeicense() {
        return leicense;
    }


    public String getCountry() {
        return country;
    }


    public LocalDateTime getFactoryData() {
        return factoryData;
    }


    public float getPriceInDKK() {
        return priceInDKK;
    }


    @Override
    public String toString() {
        return "StrangeCar{" +
                "leicense='" + leicense + '\'' +
                ", country='" + country + '\'' +
                ", factoryData=" + factoryData +
                ", priceInDKK=" + priceInDKK +
                '}';
    }
}
