package com.kodilla.abstracts.jobs;

public class Application {
    public static void main(String[] args) {
        Job programmer = new Programmer();
        System.out.println(programmer.getResponsibilities());
        System.out.println(programmer.getSalary());

        Job actor = new Actor();
        System.out.println(actor.getSalary());
        System.out.println(actor.getResponsibilities());

    }
}
