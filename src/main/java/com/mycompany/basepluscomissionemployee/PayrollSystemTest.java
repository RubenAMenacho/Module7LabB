/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basepluscomissionemployee;

import java.util.Arrays;

public class PayrollSystemTest {
    public static void main(String[] args) {
      
        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee =
                new CommissionEmployee(
                        "Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "444-44-4444", 5000, .04, 300);

  
        SalariedEmployee rubenMenacho =
                new SalariedEmployee("Ruben", "Menacho", "555-55-5555", 600.00);

        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                basePlusCommissionEmployee,
                "earned", basePlusCommissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                rubenMenacho, "earned", rubenMenacho.earnings());

      
        Employee[] employees = new Employee[5];

      
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = rubenMenacho;

        System.out.printf("Employees processed polymorphically:%n%n");

     
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee); // invokes toString

            
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
           
                BasePlusCommissionEmployee employee =
                        (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf(
                        "new base salary with 10%% increase is: $%,.2f%n",
                        employee.getBaseSalary());
            }

            double earnings = currentEmployee.earnings();
            System.out.printf("earned $%,.2f%n%n", earnings);

         
            if (earnings <= 600.00) {
                System.out.printf("%s earned $%,.2f or less%n%n", currentEmployee.getClass().getName(), earnings);
            }
        }

      
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s%n", j,
                    employees[j].getClass 
        ().getName());
}
         
  employees = Arrays.copyOf(employees, 5);
  employees[4] = new SalariedEmployee("Ruben", "Menacho", "555-55-5555", 500.00);

 
  System.out.printf("%nEmployees who earned $600 or less:%n%n");
  for (Employee currentEmployee : employees) {
      if (currentEmployee.earnings() <= 600) {
          System.out.println(currentEmployee);
      }
  }
    }
}


