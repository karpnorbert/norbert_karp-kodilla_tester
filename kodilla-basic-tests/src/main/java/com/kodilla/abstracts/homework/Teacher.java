package com.kodilla.abstracts.homework;

class Teacher extends Job {
    public Teacher(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void displayJobResponsibilities() {
        System.out.println("As a teacher, you are responsible for: " + getResponsibilities());
    }
}
