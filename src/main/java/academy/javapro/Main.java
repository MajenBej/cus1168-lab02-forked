package academy.javapro;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a new Tesla Model S, 2024
        // TODO: Add your code here

        Tesla myTesla = new Tesla("Model S", 2024);
        myTesla.setMake("Tesla");

        // Step 2: Display initial status
        System.out.println("Initial Status:");
        // TODO: Display car's initial state
       System.out.println(myTesla.getInfo() + " " + myTesla.getYear()); 
       System.out.println("Running: " + myTesla.isRunning());
       System.out.println("Autopilot: " + myTesla.isAutopilotEnabled());
       System.out.println("Charging: " + myTesla.isCharging());

        // Step 3: Start the car and test basic vehicle functions
        System.out.println("\nTesting basic vehicle functions:");
        // TODO: Start engine
        // TODO: Accelerate
        // TODO: Brake
        myTesla.startEngine();
        myTesla.accelerate();
        myTesla.brake();

        // Step 4: Test autonomous features
        System.out.println("\nTesting autonomous features:");
        // TODO: Enable autopilot
        // TODO: Check if autopilot is enabled
        // TODO: Disable autopilot
        myTesla.enableAutopilot();
        System.out.println("Autopilot " + myTesla.isAutopilotEnabled());
        System.out.println("Autopilot is currently" + myTesla.isAutopilotEnabled());
        myTesla.disableAutopilot();
        System.out.println("Autopilot " + myTesla.isAutopilotEnabled());

        // Step 5: Test electric features
        System.out.println("\nTesting electric features:");

        myTesla.charge();
        System.out.println("Charging status: " + myTesla.isCharging());
        // TODO: Start charging
        // TODO: Check charging status

        // Step 6: Stop the car and display final status
        System.out.println("\nFinal car status:");

        myTesla.stopEngine();
        System.out.println("Running: " + myTesla.isRunning());
        System.out.println("Autopilot: " + myTesla.isAutopilotEnabled());
        System.out.println("Charging: " + myTesla.isCharging());
        // TODO: Stop engine
        // TODO: Display final state
    }
}
