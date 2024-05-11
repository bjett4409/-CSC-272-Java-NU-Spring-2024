public class Test {
    public static void main(String[] args) {
        // Create profile for person
        Person person = new Person("Louis", 1961);

        // Create profile for student
        Student student = new Student("Kobe", 2000, "Structural Engineering");

        // Create profile for instructor
        Instructor instructor = new Instructor("Brandon", 1981, 90000);

        // Output specific details with correct concatenation
        System.out.println("The Person name is: " + person.getName() + ", Year of Birth: " + person.getYearOfBirth());
        System.out.println("The Student name is: " + student.getName() + ", Major: " + student.getMajor());
        System.out.println("The Instructor salary is: " + instructor.getSalary());
    }
}