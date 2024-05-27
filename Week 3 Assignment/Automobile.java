public class Automobile extends Vehicle {
    private Engine engine;
    private Tire[] tires;

    public Automobile(int engineCylinders, String tireSize) {
        super(4); // Automobiles have 4 wheels
        this.engine = new Engine(engineCylinders);
        this.tires = createTires(tireSize);
    }

    private Tire[] createTires(String size) {
        Tire[] tires = new Tire[4];
        for (int i = 0; i < 4; i++) {
            tires[i] = new Tire(size);
        }
        return tires;
    }

    public void printCharacteristics() {
        System.out.println("Automobile Characteristics:");
        System.out.println("Cylinder Count: " + engine.getCylinders());
        System.out.println("Wheel Count: " + getWheelCount());
        System.out.println("Tire Size: " + tires[0].getSize());
    }
}