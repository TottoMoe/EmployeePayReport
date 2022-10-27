package com.bookexample;
import java.util.ArrayList;

public class Payroll {
    ArrayList<Employee> employees;
    private double total;

    public Payroll() {
        employees = new ArrayList<Employee>();
        total = 0;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void printEmployee() {
        for (Employee e : employees) {
            e.printEmployeePayroll();
        }
    }

    public void calculatePayroll() {
        for (Employee e : employees) {
            e.calculateWeeklyPay();
        }
    }

    public void calculateTotal() {
        for (Employee e : employees) {
            total += e.getWeeklyPay();
        }
    }

    public void printTotal() {
        System.out.printf("%s%2.2f", "TOTAL: $", total);
        System.out.println();
        System.out.println("*A 10% bonus is awarded.");
    }

    public void printTitle() {
        System.out.printf("%s%19s%10s%10s%10s%20s", "Name", "Class", "Hours", "Sales", "Rate", "Weekly Pay");
        System.out.println();
    }

    public void printLine() {
        for (int i = 0; i <= 88; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
