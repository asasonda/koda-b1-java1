package com.koda;

public class App 
{
    public static void main( String[] args )
    {
        Employee karyawan = new Employee("EMP001", "Andi Pratama", "Backend Developer", "IT", 5000000);

        EmployeeService data = new EmployeeService(karyawan);
        data.showEmployee();
    }
}
