/**
 * This class is designed to convert into C syntax
 *
 * @author Brian Tang, 400478452, CS 3035 - 01
 */
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// struct for employees with their info
struct employee
{
    char name[25];
    double hourlyWage;
    double hoursWorked;
};

// Global variable to log the amount of entries
int empData = 0;
double totalPay = 0;

// addEmployee() method reads the employee id and adds it to the array
void addEmployee(struct employee **arr, char emp_name[], double hrlyWage, double hrsWorked)
{
    strcpy((*arr)[empData].name, emp_name);
    (*arr)[empData].hourlyWage = hrlyWage;
    (*arr)[empData].hoursWorked = hrsWorked;
    empData++;
}

// calcPaychecks() methods finds the average paycheck of the employees
void calcPaychecks(struct employee *arr)
{
    // For loop used to print out the output of names, wage, hours and total paid.
    for (int i = 0; i < empData; i++)
    {
        totalPay = totalPay + arr[i].hourlyWage * arr[i].hoursWorked;
        printf("%s, wage %.2f, hours %.0f, total pay: $%.2f\n", arr[i].name, arr[i].hourlyWage, arr[i].hoursWorked, arr[i].hourlyWage * arr[i].hoursWorked);
    }

    // Calculating the avg paycheck for each employee
    printf("Average paycheck: $%.2f\n", (totalPay / empData));
}

// Adding employees and their hours, wages, and pay
int main()
{
    // Create an employee array
    struct employee *arr = (struct employee *)malloc(5 * sizeof(struct employee));

    // Adds three employees methods
    addEmployee(&arr, "Bob Smith", 21, 21);
    addEmployee(&arr, "Sue Jones", 22.30, 12);
    addEmployee(&arr, "Carlos Suarez", 21.55, 15);

    // Prints the results of the employees paychecks
    calcPaychecks(arr);
    return 0;
}
