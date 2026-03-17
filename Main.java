/**
 * Main — demonstrate your Employee Management System.
 *
 * YOUR TASKS:
 *   Part C — Create Manager and Intern objects, demonstrate polymorphism
 *   Part D — Add try/catch blocks for exception handling
 *
 * This file should compile and run, printing output that proves
 * all your code works correctly.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== PART A: Salary Utilities ===");

          System.out.println("Annual salary: " + SalaryUtils.calculateAnnualSalary(3000));
          System.out.println("Tax on 25000: " + SalaryUtils.calculateTax(25000));
          System.out.println("Net salary: " + SalaryUtils.calculateNetSalary(25000));
          System.out.println("After 10% raise: " + SalaryUtils.applyRaise(3000, 10));


        System.out.println("\n=== PART B: Employee Manager ===");
        // TODO: Create an EmployeeManager
        // TODO: Create and add at least 3 employees to it
        // TODO: Demonstrate findById (found + not found)
        // TODO: Demonstrate getEmployeesByDepartment
        EmployeeManager manager = new EmployeeManager();
        Employee emp1 = new Employee(1, "Ahmed", "Engineering", 3500.0);
        Employee emp2 = new Employee(2, "Marwan", "IT", 2500.0);
        Employee emp3 = new Employee(3, "Ameen", "IT", 4500.0);

        manager.addEmployee(emp1);
        manager.addEmployee(emp2);
        manager.addEmployee(emp3);

        System.out.println("ID 2: " + manager.findById(2) );
        System.out.println("ID 200 " + manager.findById(200));

        System.out.println("Employees in the IT department: " + manager.getEmployeesByDepartment("it"));
        System.out.println("Employees in the engineering department: " + manager.getEmployeesByDepartment("ENGINEERING"));

        System.out.println("\n=== PART C: Inheritance & Polymorphism ===");
        // TODO: Create at least 1 Manager and 1 Intern
        // TODO: Add all employees (Employee, Manager, Intern) to the manager
        // TODO: Loop through getAllEmployees() and call getBonus() on each
        //       Print: "<name> bonus: <amount>" for each one
        //       This demonstrates polymorphism — same method call, different behavior
        Employee emp4 = new Employee(4, "Mohammed", "Marketing", 4000.0);
        Manager manager1 = new Manager(5, "Yousif", "HR", 6000.0, 8);
        Intern intern1= new Intern(6, "Ali", "Marketing", 1000.0, "Bahrain Polytechnic");

        manager.addEmployee(emp4);
        manager.addEmployee(manager1);
        manager.addEmployee(intern1);

        for(Employee emp: manager.getAllEmployees()) {
            System.out.println(emp.getName() + " bonus: " + emp.getBonus());
        }

        System.out.println("\n=== PART D: Exception Handling ===");
        // TODO: Use try/catch to demonstrate:
        //   1. Trying to remove an employee that doesn't exist
        //   2. Trying to promote an employee that's already a Manager
        //   3. Trying to create an Employee with invalid data (negative salary)
        // Each try/catch should print the error message gracefully
        
        // employee that does not exist
        try {
            manager.removeEmployee(200);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // promote an employee that's already a manager
        try {
            manager.promoteToManager(5, 8);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //create an employee with negative salary
        try {
            Employee emp5 = new Employee(7, "Abdallah", "HR", -1000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== Bonus Question ===");
        System.out.println(manager.exportAllToCSV());

    }
}
