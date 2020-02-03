package com.timurradko.itCompany.abstractClasses;

import com.timurradko.itCompany.interfacesITWorkers.Tester;

public abstract class QATester extends ProjectWorker implements Tester {
    public String name = "QA Tester";

    protected QATester() {
        super();
    }

    @Override
    public void test() {
        System.out.println("After I drink coffee, I will test our program");
    }

    @Override
    public String toString() {
        return name;
    }
}
