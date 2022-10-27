package com.bookexample;

public class CommissionEmployee extends Employee {
    private double commission;
    private double sales;

    public CommissionEmployee(String aName, String aType, double aSale) {
        this.name = aName;
        this.type = aType;
        sales = aSale;
        commission = 0.2;
    }

    @Override
    public double calculateWeeklyPay() {
        weeklyPay = sales * commission;
        return weeklyPay;
    }

    @Override
    public void printEmployeePayroll() {
        System.out.printf("%s%15s%10s%3.2f%19s%3.2f", name, type, "$", sales, "$", weeklyPay);
        System.out.println();
    }

    public double getCommission() {
        return commission;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
}
