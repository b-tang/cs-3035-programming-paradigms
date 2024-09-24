/**
 * This class is designed to be a driver class for the "Employees class"
 * with only call methods.
 * 
 * @author Brian Tang, 400478452, CS 3035 - 01
 */
public class Driver {
    public static void main(String[] args) {
        
        // Calls three employees methods
        Employee.addEmployee("Bob Smith", 21, 21);
        Employee.addEmployee("Sue Jones", 22.30, 12);
        Employee.addEmployee("Carlos Suarez", 21.55, 15);
        
        // Calls the results of the employees paychecks
        Employee.calcPaychecks();
    }
}
