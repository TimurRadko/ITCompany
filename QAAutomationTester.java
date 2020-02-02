package com.timurradko.itCompany;

public class QAAutomationTester extends QATester implements MakeCoffee, Testing {
    public String name = "QA Automation Tester";

    protected QAAutomationTester() {
        super(ITWorkerType.MIDDLE);
    }

    @Override
    public void testing() {
        System.out.println("I'm testing the program, that Developer wrote automatically");
    }

    @Override
    public String toString() {
        return name;
    }
}
