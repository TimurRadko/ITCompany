package com.timurradko.itCompany;

public class QAManualTester extends QATester{
    public String name = "QA Manual Tester";

    protected QAManualTester(String name) {
        super();
        this.name = name;
    }

    @Override
    public void test() {
        System.out.println("I'm testing the program, that Developer wrote manually");
    }

    @Override
    public String toString() {
        return name;
    }
}
