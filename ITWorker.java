package com.timurradko.itCompany;

public abstract class ITWorker implements MakeCoffee {
    protected boolean coffee;

    protected ITWorker(boolean coffee) {
        this.coffee = false;
    }

    @Override
    public void makeCoffee() {
        System.out.println("I'm making coffee");
    }
}
