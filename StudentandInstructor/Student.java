public class Student extends Person {
    private String major;

    // Constructor for Student
    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    // Getter method for major
    public String getMajor() {
        return major;
    }

    // toString method for Student
    @Override
    public String toString() {
        return "Student[name=" + getName() + ", yearOfBirth=" + getYearOfBirth() + ", major=" + major + "]";
    }
}