package DesignPattern;

/**
 * Dependency Inversion Principle (DIP)
 * 	 - High-level modules should not depend on low-level modules.
 * 	   Both should depend on abstractions.
 * 	 - Abstractions should not depend on details.
 * 	   Details should depend on abstractions.
 * 	 - low level means it's a data Storage. For Example keeps a list and give access
 * 	 - high level means it perform the whole operation
 * 	 - usage of the datastorage should be implemented in the low level class
 *
 * 	 + in case of code change in the storage not every usage has to be rebuild
 */

// Before

// low level
class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }
    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }
}

// high level. This class is depending on the Lightbulb. Its not possible to switch something else on and off
class ElectricPowerSwitch {
    public LightBulb lightBulb;
    public boolean on;
    public ElectricPowerSwitch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        this.on = false;
    }
    public boolean isOn() {
        return this.on;
    }
    public void press(){
        boolean checkOn = isOn();
        if (checkOn) {
            lightBulb.turnOff();
            this.on = false;
        } else {
            lightBulb.turnOn();
            this.on = true;
        }
    }
}

// After
// Its not depending anymore. If a new Electric Item is added it could use the same method
interface Switch {
    boolean isOn();
    void press();
}

interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }
}

class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }
    @Override
    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }
}

class ElectricPowerSwitch implements Switch {
    public Switchable client;
    public boolean on;
    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
        this.on = false;
    }
    public boolean isOn() {
        return this.on;
    }
    public void press(){
        boolean checkOn = isOn();
        if (checkOn) {
            client.turnOff();
            this.on = false;
        } else {
            client.turnOn();
            this.on = true;
        }
    }
}
