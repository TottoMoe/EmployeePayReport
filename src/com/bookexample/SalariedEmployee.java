package com.bookexample;

public class SalariedEmployee extends Employee {
    private double bonus;

    public SalariedEmployee(String aName, String aType, double aWeeklyPay,double aBonus) {
        this.name = aName;
        this.type = aType;
        this.weeklyPay = aWeeklyPay;
        bonus = aBonus;
    }

    @Override
    public double calculateWeeklyPay() {
        weeklyPay = weeklyPay + (weeklyPay * bonus);
        return weeklyPay;
    }

    @Override
    public void printEmployeePayroll() {
        if (bonus > 0) {
            System.out.printf("%s%15s%38s%3.2f%s", name, type, "$", weeklyPay, "*");
            System.out.println();
        } else {
            System.out.printf("%s%15s%41s%3.2f", name, type, "$", weeklyPay);
            System.out.println();

        }
    }
}
