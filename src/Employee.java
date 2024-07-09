public class Employee extends Person {
    private int id;
    private double hourlyPay;

    public Employee(String firstName, String lastName, int id, double hourlyPay) {
        super(firstName, lastName);
        this.id = id;
        this.hourlyPay = hourlyPay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    // Method to give a 15% raise
    public double getRaise() {
        double raiseAmount = hourlyPay * 0.15;
        hourlyPay += raiseAmount;
        return hourlyPay;
    }

    // Method to calculate weekly pay
    public double payDay(int hoursWorked) {
        double totalPay = 0;

        if (hoursWorked > 40) {
            int regularHours = 40;
            int overtimeHours = hoursWorked - 40;
            totalPay = regularHours * hourlyPay + overtimeHours * hourlyPay * 1.5;
        } else {
            totalPay = hoursWorked * hourlyPay;
        }

        return totalPay;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() +
                String.format("They make $%.2f%nThey have the employee ID %d%n", hourlyPay, id);
    }
}
