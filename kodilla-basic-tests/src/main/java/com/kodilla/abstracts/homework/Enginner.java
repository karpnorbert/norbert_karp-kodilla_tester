package com.kodilla.abstracts.homework;

class Engineer extends Job {
    public Engineer(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void displayJobDescription() {
        System.out.println("Job: Engineer");
        System.out.println("Responsibilities: " + getResponsibilities());
        System.out.println("Salary: " + getSalary());
    }
}