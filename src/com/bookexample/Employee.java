package com.bookexample;

public class Employee {
    protected String name;
    protected String type;

    protected double weeklyPay;

    public Employee() {}

    public Employee(String aName, String aType) {
        name = aName;
        type = aType;
    }

    public double calculateWeeklyPay() { return 0; }

    public void printEmployeePayroll() {}

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }

    public double getWeeklyPay() {
        return weeklyPay;
    }
}
