package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new SaleriedEmployee("Andrew", 90 , 160);
        employee[1] = new ContractEmployee("Elizabeth", 19400);
        employee[2] = new SaleriedEmployee("Archie", 100 , 140);
        employee[3] = new SaleriedEmployee("Veronica", 110 , 160);
        employee[4] = new ContractEmployee("Fred", 25500);
        employee[5] = new ContractEmployee("James", 21300);
        employee[6] = new SaleriedEmployee("William",120 ,160);
        employee[7] = new ContractEmployee("Tabitha", 20600);
        employee[8] = new SaleriedEmployee("Kevin",110, 200);
        employee[9] = new ContractEmployee("John", 16700);


        Employee.sortBySalary(employee);
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }
}
