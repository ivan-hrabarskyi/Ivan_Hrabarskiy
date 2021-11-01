package com.company;

import java.util.Arrays;

public class SaleriedEmployee extends Employee implements PaymentCalculation{
    private String name;
    private String socialSecurityNumber;
    private int salary;
    private int hourlyRate;
    private int numberOfHours;


    public SaleriedEmployee(String name, int hourlyRate, int numberOfHours){
        socialSecurityNumber = "Your nine-digit Social Security number is your first and continuous connection with Social Security.\n" +
                "It helps government identify and accurately record your covered wages or self-employment earnings.\n" +
                "Government also use it to monitor your record once you start getting benefits";
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
        calculatePay();
    }

    @Override
    public int getEmployeeSalary() {
        return salary;
    }

    @Override
    public int calculatePay() {
        return salary = hourlyRate * numberOfHours;
    }

    @Override
    public String toString() {
        calculatePay();
        return super.toString() + "Name = " + name + '\t' + "Salary = " + salary;
    }

}
