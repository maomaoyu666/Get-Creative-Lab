// Parent Class
public class Vehicle {
    private String brand;
    protected int speed;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }
}

// Child Class 1
final class Car extends Vehicle {
    private String type;

    public Car(String brand, String type) {
        super(brand);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Child Class 2
final class Bike extends Vehicle {
    private boolean hasTrainingWheels;

    public Bike(String brand, boolean hasTrainingWheels) {
        super(brand);
        this.hasTrainingWheels = hasTrainingWheels;
    }

    public boolean hasTrainingWheels() {
        return hasTrainingWheels;
    }
}

// Child Class 3
final class Truck extends Vehicle {
    private int payloadCapacity;

    public Truck(String brand, int payloadCapacity) {
        super(brand);
        this.payloadCapacity = payloadCapacity;
    }

    public int getPayloadCapacity() {
        return payloadCapacity;
    }
}

// Child Class 4
final class Boat extends Vehicle {
    private boolean isMotorized;

    public Boat(String brand, boolean isMotorized) {
        super(brand);
        this.isMotorized = isMotorized;
    }

    public boolean isMotorized() {
        return isMotorized;
    }
}

// Test class
class VehicleTest {
    public static void main(String[] args) {
        // Create instances of each vehicle
        Car myCar = new Car("Tesla", "Hybrid");
        Bike myBike = new Bike("Giant", false);
        Truck myTruck = new Truck("Volvo", 10000);
        Boat myBoat = new Boat("Yamaha", true);

        // Display information for each vehicle
        System.out.println("My car is a " + myCar.getBrand() + " and is $" + myCar.getType());
        System.out.println("My bike is a " + myBike.getBrand() + " and it is " + (myBike.hasTrainingWheels() ? "equipped with" : "not equipped with") + " training wheels.");
        System.out.println("My truck is a " + myTruck.getBrand() + " and has a payload capacity of " + myTruck.getPayloadCapacity() + " kg.");
        System.out.println("My boat is a " + myBoat.getBrand() + " and it is " + (myBoat.isMotorized() ? "motorized" : "not motorized") + ".");
    }
}
