package edu.miu.lab4.problem3;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee(20, 10);
        SalariedEmployee salariedEmployee = new SalariedEmployee(400);
        CommisionEmployee commisionEmployee = new CommisionEmployee(5_000, 5);
        BasePlusCommisionEmployee basePlusCommisionEmployee = new BasePlusCommisionEmployee(10_000);

        Employee[] employees = { hourlyEmployee, salariedEmployee, commisionEmployee, basePlusCommisionEmployee };

        Employee[] salaryList = findSalaryList(employees, 20000);
        System.out.println("Salary List : ");
        System.out.println(Arrays.toString(salaryList));
    }

    public static Employee[] findSalaryList (Employee[] col, double salary) {
        if(col == null || col.length == 0 || salary < 0) {
            return new Employee[]{};
        }
        int count = 0;
        for(Employee e: col) {
            if (e == null) continue;
            if(e.getPayment() < salary) {
                count++;
            }
        }
        Employee[] filteredEmployee = new Employee[count];
        int i = 0;
        for (Employee employee: col) {
            if (employee == null) continue;
            if(employee.getPayment() < salary) {
                filteredEmployee[i++] = employee;
            }
        }
        return filteredEmployee;
    }
}
