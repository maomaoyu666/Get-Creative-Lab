// The base Animal class
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Dog subclass
class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();  // Call the superclass (Animal) method
        System.out.println("The dog barks");
    }
}

// Cat subclass
class Cat extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();  // Call the superclass (Animal) method
        System.out.println("The cat meows");
    }Q
}

// Bird subclass
class Bird extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();  // Call the superclass (Animal) method
        System.out.println("The bird chirps");
    }


static class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myDog = new Dog();        // Create a Dog object
        Animal myCat = new Cat();        // Create a Cat object
        Animal myBird = new Bird();      // Create a Bird object

        myAnimal.makeSound();  // Calls the method from Animal class
        myDog.makeSound();     // Calls the method from Dog class
        myCat.makeSound();     // Calls the method from Cat class
        myBird.makeSound();    // Calls the method from Bird class
    }
}
}
