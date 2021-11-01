package com.company;

public class ContractEmployee extends Employee implements PaymentCalculation{
    private String name;
    private String federalTaxIdmember;
    private int salary;
    private int fixedMonthlyPayment;

    public ContractEmployee(String name, int fixedMonthlyPayment){
        federalTaxIdmember = "Federal income tax applies to every registered business '\n' " +
                "depending on your business’s structure, you might have to pay corporate income tax instead";
        this.name = name;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        calculatePay();
    }

    @Override
    public int getEmployeeSalary() {
        return salary;
    }

    @Override
    public int calculatePay() {
        return salary = fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        calculatePay();
        return super.toString() + "Name = " + name + '\t' + "Salary = " + salary;
    }

}
