package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int theNumberOfSidesOfTheFigure;

    private  Shape (int theNumberOfSidesOfTheFigure){
        this.theNumberOfSidesOfTheFigure = theNumberOfSidesOfTheFigure;
    }

    public int getTheNumberOfSidesOfTheFigure(){
        return theNumberOfSidesOfTheFigure;
    }
}
