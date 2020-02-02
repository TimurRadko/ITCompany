package com.timurradko.itCompany;

public abstract class QATester extends ProjectWorker implements MakeCoffee, Testing{
    public String name = "QA Tester";

    protected QATester(ITWorkerType typeWorker) {
        super(ITWorkerType.MIDDLE);
    }

    @Override
    public void testing() {
        System.out.println("I'm testing the program, that Developer wrote");
    }

    @Override
    public String toString() {
        return name;
    }
}
