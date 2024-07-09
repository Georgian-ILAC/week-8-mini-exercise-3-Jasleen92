public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jasleen", "kaur", 12345, 16.0);

        // Print employee details using toString method
        System.out.println(employee);

        // Test getRaise method
        System.out.println("New hourly pay after raise: $" + employee.getRaise());

        // Test payDay method
        System.out.println("Weekly pay for 45 hours worked: $" + employee.payDay(45));
    }
}
