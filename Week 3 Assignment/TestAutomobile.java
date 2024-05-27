public class TestAutomobile {
    public static void main(String[] args) {
        try {
            System.out.println("Creating an automobile with 265-75-R16 tires:");
            Automobile car1 = new Automobile(6, "265-75-R16");
            car1.printCharacteristics();
            
            System.out.println("\nCreating an automobile with 285-75-R16 tires:");
            Automobile car2 = new Automobile(6, "285-75-R16");
            car2.printCharacteristics();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
