package com.kodilla.abstracts.homework;

class Doctor extends Job {
    public Doctor(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void displayJobResponsibilities() {
        System.out.println("As a doctor, you are responsible for: " + getResponsibilities());
    }
}

