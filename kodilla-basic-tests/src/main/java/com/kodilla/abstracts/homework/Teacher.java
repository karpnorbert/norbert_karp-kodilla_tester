package com.kodilla.abstracts.homework;

class Teacher extends Job {
    public Teacher(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void displayJobDescription() {
        System.out.println("Job: Teacher");
        System.out.println("Responsibilities: " + getResponsibilities());
        System.out.println("Salary: " + getSalary());
    }
}
