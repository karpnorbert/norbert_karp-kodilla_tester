package com.kodilla.abstracts.homework;

class Doctor extends Job {
    public Doctor(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void displayJobDescription() {
        System.out.println("Job: Doctor");
        System.out.println("Responsibilities: " + getResponsibilities());
        System.out.println("Salary: " + getSalary());
    }
}

