package NewSystem;

import java.time.LocalDateTime;

public class StrangeCar  {
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

    public void setLeicense(String leicense) {
        this.leicense = leicense;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDateTime getFactoryData() {
        return factoryData;
    }

    public void setFactoryData(LocalDateTime factoryData) {
        this.factoryData = factoryData;
    }

    public float getPriceInDKK() {
        return priceInDKK;
    }

    public void setPriceInDKK(float priceInDKK) {
        this.priceInDKK = priceInDKK;
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
