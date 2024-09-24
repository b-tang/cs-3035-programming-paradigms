/**
 * This class is designed for only "public static" variables and methods
 * for adding employees and calculating the employees paychecks using "hourlyWages"
 * and "hoursWorked".
 * 
 * @author Brian Tang, 400478452, CS 3035 - 01
 */
public class Employee {

    // Public static variables 
    public static String empName [] = new String[5];
    public static double hourlyWages [] = new double[5];
    public static double hoursWorked [] = new double[5];
    public static int empData = 0;
    public static double totalPay = 0;

    // addEmployee() method reads the inputted employee name, hrly wages, and hrs worked
    public static void addEmployee(String name, double hrlyWages, double hrsWorked) {
        empName[empData] = name;
        hourlyWages[empData] = hrlyWages;
        hoursWorked[empData] = hrsWorked;
        totalPay = totalPay + hourlyWages[empData] * hoursWorked[empData];
        empData = empData + 1;
    }

    // calcPaychecks() methods finds the average paycheck of the employees
    public static void calcPaychecks() {

        // For loop used to print out the output of names, wage, hours and total paid.
        for (int i = 0; i < empData; i++) {
            System.out.printf("%s, wage %.2f, hours %.0f, total pay: $%.2f\n", empName[i], hourlyWages[i], hoursWorked[i], hourlyWages[i] * hoursWorked[i]);
        }

        // Calculating the avg paycheck for each employee
        System.out.printf("Average paycheck: $%.2f", (totalPay / empData));
    }
}
