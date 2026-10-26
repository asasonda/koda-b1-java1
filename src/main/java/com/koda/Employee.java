package com.koda;

public class Employee {
    private String employeeId;
    private String name;
    private String position;
    private String department;
    private int salary;

    public Employee(String employeeId, String name, String position, String department, int salary){
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.department = department;
        this.salary = salary;
    }

    public String getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return name;
    }
    public String getEmployeePosition(){
        return position;
    }
    public String getEmployeeDepartement(){
        return department;
    }
    public int getEmployeeSalary(){
        return salary;
    }

    public void increaseSalary(int amount){
        if(amount < 0){
            System.out.println("Error: kenaikan Gaji harus lebih dari 0");
        }
        else{
            salary += amount;
        }

    }
}
