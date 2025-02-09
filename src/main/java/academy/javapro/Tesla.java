package academy.javapro;

public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    @SuppressWarnings("unused")
    private boolean charging;

    // TODO: Create constructor that takes model and year
    Tesla(String model, int year) {
        super(model, year, model);
        
        this.autopilotEnabled = false;
        this.charging = false;
    }

   
    // TODO: Set make to "Tesla"
    
    @Override
    public void setMake(String make) {
        super.setMake("Tesla");
    }

    public String getInfo() {
        return this.make + " " + this.model + " ";
    }
    
    // TODO: Initialize autopilotEnabled and charging to false
    

    @Override
    public void disableAutopilot() {
        this.autopilotEnabled = false;
    }

    @Override
    public void charge() {
        // TODO Auto-generated method stub
        System.out.println(this.getInfo() + " is now charging");
        this.charging = true;
    }

    // TODO: Implement all required methods from Vehicle, Electric, and Autonomous

    @Override
    public boolean isCharging() {
        // TODO Auto-generated method stub
        
        return false;
    }

    
    @Override
    public void brake() {
        // TODO Auto-generated method stub
        System.out.println(getInfo() + "is braking...");
    }

    @Override
    public void accelerate() {
        System.out.println(getInfo() + "is accelerating...");
    }

    @Override
    public void startEngine() {
        // TODO Auto-generated method stub
        this.isRunning = true;
        this.disableAutopilot();
        System.out.println(getInfo() + "started");
    }

    @Override
    public void stopEngine() {
        // TODO Auto-generated method stub
        this.isRunning = false;
        System.out.println(getInfo() + "stopped");
        
    }

    @Override
    public boolean isAutopilotEnabled() {
        // TODO Auto-generated method stub
       return this.autopilotEnabled;
    }

    @Override
    public void enableAutopilot() {
       this.autopilotEnabled = true;
    }
    // Each method should include appropriate print statements
}
