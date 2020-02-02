package com.timurradko.itCompany;

public abstract class ITWorker implements CoffeeMaker {
    protected boolean coffee;

    protected ITWorker() {
        this.coffee = false;
    }

    @Override
    public void makeCoffee() {
        System.out.print("- I made coffee! ");
        coffee = true;
    }
}
