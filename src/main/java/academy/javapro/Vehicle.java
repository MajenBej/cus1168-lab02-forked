package academy.javapro;

public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected boolean isRunning;

    // TODO: Add constructor
    Vehicle(String model, int year, String make) {
        this.make = make;
        this.model = model;
        this.year = year;

        this.isRunning = false;
    }
    // TODO: Add abstract methods
    public abstract void startEngine();
        
    public abstract void stopEngine();
        
    public abstract void accelerate();

    public abstract void brake();
        
    // TODO: Add getters/setters

    public boolean isRunning() {
        return this.isRunning;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public String getMake() {
        return this.make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
