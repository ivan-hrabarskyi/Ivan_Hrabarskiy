package com.company;

public abstract class Employee {
    private String employeeId;
    private static int count = 0;

    public Employee(){
        count++;
        this.employeeId = Integer.toString(count);
    }

    @Override
    public String toString() {
        return "Employee Id = " + employeeId + '\t';
    }

    public abstract int getEmployeeSalary();

    public static void sortBySalary(Employee[] employees){
        Employee temp;
        for (int i = 0; i < employees.length - 1; i++) {
            for(int j = i + 1; j < employees.length; j++){
                if(employees[i].getEmployeeSalary() < employees[j].getEmployeeSalary()){
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
    }
}
