class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2022, 4);
        Car car2 = new Car("Honda", "Civic", 2021, 2);
        Motorcycle moto1 = new Motorcycle("Yamaha", "R15", 2023, false);
        Motorcycle moto2 = new Motorcycle("Harley", "Sportster", 2020, true);

        car1.displayInfo();
        System.out.println("-------------------");
        car2.displayInfo();
        System.out.println("-------------------");
        moto1.displayInfo();
        System.out.println("-------------------");
        moto2.displayInfo();
        System.out.println("-------------------");
    }
}
