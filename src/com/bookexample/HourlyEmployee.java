package com.bookexample;

public class HourlyEmployee extends Employee {
    private int hour;
    private double rate;
    private double extraHourRate;

    public HourlyEmployee(String aName, String aType, int aHour, double aRate) {
        this.name = aName;
        this.type = aType;
        this.hour = aHour;
        this.rate = aRate;
        extraHourRate = 2;
    }

    @Override
    public double calculateWeeklyPay() {
        int regHour = 40;
        double totalHour = this.getHour();
        double regRate = this.getRate();
        double extraTotal = (totalHour - regHour) * regRate * extraHourRate;
        if (totalHour > regHour) {
           this.weeklyPay = regHour * regRate + extraTotal;
        } else {
            this.weeklyPay = hour * regRate;
        }
        return weeklyPay;
    }

    @Override
    public void printEmployeePayroll() {
        System.out.printf("%s%10s%8d%18s%3.2f%10s%3.2f", name, type, hour, "$", rate, "$", weeklyPay);
        System.out.println();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getExtraHourRate() {
        return extraHourRate;
    }
}
