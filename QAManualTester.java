package com.timurradko.itCompany;

public class QAManualTester extends QATester implements MakeCoffee, Testing {
    public String name = "QA Manual Tester";

    protected QAManualTester() {
        super(ITWorkerType.MIDDLE);
    }

    @Override
    public void testing() {
        System.out.println("I'm testing the program, that Developer wrote manually");
    }

    @Override
    public String toString() {
        return name;
    }
}
