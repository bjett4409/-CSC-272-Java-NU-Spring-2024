public class Instructor extends Person {
    private double salary;

    // Constructor for Instructor
    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // toString method for Instructor
    @Override
    public String toString() {
        return "Instructor[name=" + getName() + ", yearOfBirth=" + getYearOfBirth() + ", salary=" + salary + "]";
    }
}