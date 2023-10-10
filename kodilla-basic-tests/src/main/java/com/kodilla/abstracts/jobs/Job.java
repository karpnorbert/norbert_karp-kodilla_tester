package com.kodilla.abstracts.jobs;

public class Job {
    private int salary;
    private String responsibilities;

    protected Job(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public int getSalary() {
        return salary;
    }
    public String getResponsibilities() {
        return responsibilities;
    }
}
