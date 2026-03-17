/**
 * Manager — extends Employee with a teamSize field.
 *
 * YOUR TASK (Part C):
 *   1. Extend the Employee class
 *   2. Add a private int teamSize field
 *   3. Create a constructor: Manager(int id, String name, String department, double salary, int teamSize)
 *      - Call the parent constructor with super(...)
 *      - Set teamSize
 *   4. Add a getter and setter for teamSize
 *   5. Override toString() to include teamSize, e.g.:
 *      "Manager{id=1, name='Sara', department='Engineering', salary=5000.0, teamSize=8}"
 *   6. Override getBonus() to return 15% of salary (salary * 0.15)
 */

// TODO: Create the Manager class here
public class Manager extends Employee {
    // declare teamSize field
    private int teamSize;

    // constructor for Manager class
    public Manager(int id, String name, String department, double salary, int teamSize) {
        // calling parent constructor with super
        super(id, name, department, salary);
        // setting teamSize 
        this.teamSize = teamSize;
    }

    // getters and setters for teamSize
    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        // change from employee to manager
        return "Manager{" +
                "id=" + id + ", " +
                "name='" + name + '\'' + ", " +
                "department='" + department + '\'' + ", " +
                "salary=" + salary + '\'' + ", " +
                // includes teamSize
                "teamSize=" + teamSize +
                '}';
    }

    @Override
    public double getBonus() {
        return salary * 0.15;
    }

}
