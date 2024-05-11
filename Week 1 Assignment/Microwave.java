public class Microwave {
    private int time; // 30 seconds or 60 seconds
    private int powerLevel; // Power levels will be 1 or 2

    public Microwave() { // This will initiate the start microwave settings.
        this.time = 0; // Start timer is 0
        this.powerLevel = 1; // Default power level is 1.
    }

    
    public void addTime() {
        this.time += 30; // Adding time in 30 second increments.
        System.out.println("Microwave time was increased by 30 seconds. Total time: " + this.time + " seconds."); // Display output of added time. 
    }

    public void switchPowerLevel() {
        this.powerLevel = (this.powerLevel == 1) ? 2 : 1; // Switch from power level 1 to level 2
        System.out.println("Microwave power level was switched to: " + this.powerLevel); // Display output of power level 2.
    }

    public void start() { // Start microwave for new time.
        System.out.println("Cooking for " + this.time + " seconds at level " + this.powerLevel + "."); // Display output of cooking time and power level.
    }

    public void reset() { // Reset default settings on the microwave settings.
        this.time = 0;
        this.powerLevel = 1;
        System.out.println("Microwave is reset to default settings.");
    }

    public static void main(String[] args) {
        Microwave microwave = new Microwave();

        System.out.println("Initial microwave state:"); // Initial State
        microwave.start();

        System.out.println("\nAdding time:"); // Adding time to the microwave timer
        microwave.addTime();
        microwave.addTime();

        System.out.println("\nSwitching power level:"); // Power Level switch
        microwave.switchPowerLevel();

        System.out.println("\nStarting microwave:"); // Start Microwave Sequence
        microwave.start();

        System.out.println("\nResetting microwave:"); // Microwave Reset
        microwave.reset();

        System.out.println("\nFinal microwave state:"); // Final Output after testing
        microwave.start();
    }
}