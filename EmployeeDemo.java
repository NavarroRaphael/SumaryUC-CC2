class Employee {
    // Attributes
    String employeeID;
    String name;
    double hourlyWage;
    double hoursWorked;

    // Constructor to initialize the employee's details
    public Employee(String employeeID, String name, double hourlyWage, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    // Method to calculate the monthly salary
    public double calculateSalary() {
        return hourlyWage * hoursWorked * 4; // Assuming 4 weeks in a month
    }

    // Method to display the employee details
    public void displayEmployeeDetails() {
        double salary = calculateSalary();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Hourly Wage: $" + hourlyWage);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Monthly Salary: $" + salary);
        System.out.println("--------------------------------------------");
    }
}

// Main program to create and manage multiple employees
public class EmployeeDemo {
    public static void main(String[] args) {
        // Create multiple Employee objects
        Employee emp1 = new Employee("E2571A", "Sebastian cross", 25.50, 40); // 40 hours per week
        Employee emp2 = new Employee("E0021E", "May Volate", 30.00, 35); // 35 hours per week
        Employee emp3 = new Employee("E3125D", "Bianca Christina", 28.75, 45); // 45 hours per week
        Employee emp4 = new Employee("E42AE5", "Scarlet rose", 32.11, 46); // 46 hours per week

        // Display details for each employee
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();
        emp4.displayEmployeeDetails();
    }
}