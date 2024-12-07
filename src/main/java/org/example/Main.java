package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {

        Healthplan healthplan1 = new Healthplan(1, "Berk", Plan.BASIC);

        Employee employee1 = new Employee(1, "Berk", "testMail", "123", new String[]{"1", "Full"});

        Company company1 = new Company(1, "testCompany", 1.2, new String[]{"Berk", "Naz", "Nisan", "Eylül"});
        System.out.println(healthplan1.toString());
        System.out.println(employee1.toString());
        System.out.println(company1.toString());


    }
}