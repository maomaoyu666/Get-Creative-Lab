public class VehicleExample {

    // Vehicle base class
    public static class Vehicle {
        private String model;
        protected String brand;
        public int year;

        public Vehicle(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public String displayInfo() {
            return "Brand: " + this.brand + ", Model: " + this.model + ", Year: " + this.year;
        }
    }

    // Subclasses
    public static class Car extends Vehicle {
        public int doors;

        public Car(String brand, String model, int year, int doors) {
            super(brand, model, year);
            this.doors = doors;
        }
    }

    public static class Truck extends Vehicle {
        public int payload;

        public Truck(String brand, String model, int year, int payload) {
            super(brand, model, year);
            this.payload = payload;
        }
    }

    public static class Motorcycle extends Vehicle {
        public int cc;

        public Motorcycle(String brand, String model, int year, int cc) {
            super(brand, model, year);
            this.cc = cc;
        }
    }

    public static class Bus extends Vehicle {
        public int capacity;

        public Bus(String brand, String model, int year, int capacity) {
            super(brand, model, year);
            this.capacity = capacity;
        }
    }

    // Recursive methods
    public static int countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
            return 0;
        } else {
            System.out.println(n);
            return countdown(n - 1);
        }
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }

    public static String reverseString(String s) {
        if (s.isEmpty()) {
            return s;
        } else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }

    public static void main(String[] args) {
        // Call and demonstrate recursive methods
        countdown(5);
        System.out.println("Factorial of 5 is: " + factorial(5));
        System.out.println("Fibonacci of 5 is: " + fibonacci(5));
        System.out.println("Sum of digits in 12345 is: " + sumOfDigits(12345));
        System.out.println("Reverse of 'hello' is: " + reverseString("hello"));

        // Vehicle instances
        Car car = new Car("Toyota", "Corolla", 2020, 4);
        Truck truck = new Truck("Ford", "F-150", 2019, 1000);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2021, 750);
        Bus bus = new Bus("Volvo", "7900 Electric", 2022, 50);

        // Display vehicle information
        System.out.println(car.displayInfo());
        System.out.println(truck.displayInfo());
        System.out.println(motorcycle.displayInfo());
        System.out.println(bus.displayInfo());
    }
}
