public class Person {
    private String firstName;
    private String lastName;
    private double height;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHeight() {
        return height;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Override toString method
    @Override
    public String toString() {
        return String.format("Name: %s %s%n", firstName, lastName);
    }
}
