public class Engine {
    private int cylinders;

    public Engine(int cylinders) {
        if (cylinders == 4 || cylinders == 6 || cylinders == 8) {
            this.cylinders = cylinders;
        } else {
            throw new IllegalArgumentException("Invalid number of cylinders. Must be 4, 6, or 8.");
        }
    }

    public int getCylinders() {
        return cylinders;
    }
}