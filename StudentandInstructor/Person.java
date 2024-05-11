public class Person {
    private String name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name; // Name of person
        this.yearOfBirth = yearOfBirth; // Person year of birth
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    // toString method for Person
    @Override
    public String toString() {
        return "Person[name=" + name + ", yearOfBirth=" + yearOfBirth + "]";
    }
}