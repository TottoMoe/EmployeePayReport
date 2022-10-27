package com.bookexample;

public class EmployeePayReport {

    public static void main(String[] args) {
	    Employee emp1 = new HourlyEmployee("Jennifer Waltz", "Hourly", 45,10.95);
        Employee emp2 = new HourlyEmployee("Moly Smith", "Hourly.",32, 15.00);
        Employee emp3 = new SalariedEmployee("James Hogan", "Salaried", 3000.00, 0.1);
        Employee emp4 = new SalariedEmployee("Joan Han", "Salaried", 2600.00, 0);
        Employee emp5 = new CommissionEmployee("Marry Butler", "Commissioned", 10000.00);

        Payroll payroll = new Payroll();
        payroll.printTitle();
        payroll.printLine();
        payroll.addEmployee(emp1);
        payroll.addEmployee(emp2);
        payroll.addEmployee(emp3);
        payroll.addEmployee(emp4);
        payroll.addEmployee(emp5);
        payroll.calculatePayroll();
        payroll.printEmployee();
        payroll.printLine();
        payroll.calculateTotal();
        payroll.printTotal();
    }
}
