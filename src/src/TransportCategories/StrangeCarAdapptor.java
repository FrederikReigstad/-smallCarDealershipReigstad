package TransportCategories;

import NewSystem.IStrangeCar;

public class StrangeCarAdapptor implements ICar {
private IStrangeCar car;
private double price;

    public StrangeCarAdapptor(IStrangeCar strangeCar) {
        car = strangeCar;
        price = car.getPriceInDKK();

    }

    @Override
    public int getYear() {
        return car.getFactoryData().getYear();
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getLicensePlate() {
        return car.getLeicense();
    }

    @Override
    public String getMake() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String toString() {
        return "StrangeCarAdapptor{" +
                "car=" + car +
                ", price=" + price +
                '}';
    }
}
