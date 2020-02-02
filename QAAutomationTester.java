package com.timurradko.itCompany;

public class QAAutomationTester extends QATester{
    public String name;

    protected QAAutomationTester() {
        super();
        this.name = "QA Automation Tester";
    }

    @Override
    public void test() {
        System.out.println("After I drink coffee, I will test the program automatically");
    }

    @Override
    public String toString() {
        return name;
    }
}
