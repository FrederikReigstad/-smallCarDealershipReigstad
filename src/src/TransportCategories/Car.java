package TransportCategories;

public class Car implements ICar {
    private int year;
    private double price;
    private String licensePlate;
    private String make;
    private String model;

    public Car(int year, double price, String licensePlate, String make, String model) {
        this.year = year;
        this.price = price;
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", price=" + price +
                ", licensePlate='" + licensePlate + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLicensePlate() {
        return licensePlate;
    }


    public String getMake() {
        return make;
    }


    public String getModel() {
        return model;
    }


}
