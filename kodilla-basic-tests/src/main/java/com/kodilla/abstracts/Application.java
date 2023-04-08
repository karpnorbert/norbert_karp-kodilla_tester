package com.kodilla.abstracts;

import com.kodilla.abstracts.jobs.Job;

public class Application {

    public static void main(String[] args) {
        Animal dog = new Dog();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
    }
}