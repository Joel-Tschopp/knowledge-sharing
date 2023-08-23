package DesignPattern.Principle;

/**
 * Liskov Substitution Principle (LSP)
 * 	 - add sub classes without breaking the main class
 * 	 - main works with specific functionality
 * 	 - never change fundamental functionality in sub classes
 *
 * 	 + main is generic usable
 */

/*
// Before
// In this Example the Penguin could fly because he is a bird. But that ain't the case
class Bird {
    void fly() {
        System.out.println("I'm flying");
    }

    void walk() {
        System.out.println("I'm walking");
    }
}

class Dove extends Bird{

}
class Penguin extends Bird{

}

// After
// Like this the Penguin can't fly and we dont break the LSP
class Bird {
    void walk() {
        System.out.println("I'm walking");
    }
}
class FlyingBird extends Bird{
    public void fly() {
        System.out.println("I'm flying");
    }
}

class Dove extends FlyingBird{}

class Penguin extends Bird{ }
*/