package com.kodilla.abstracts.homework;

class Engineer extends Job {
    public Engineer(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void displayJobResponsibilities() {
        System.out.println("As an engineer, you are responsible for: " + getResponsibilities());
    }
}