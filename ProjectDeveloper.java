package com.timurradko.itCompany;

public class ProjectDeveloper extends ProjectWorker implements MakeCoffee, Developing {
    public String name = "Project Developer";

    protected ProjectDeveloper() {
        super(ITWorkerType.MIDDLE);
    }

    @Override
    public void developing() {
        System.out.println("I'm developing the program");
    }

    @Override
    public String toString() {
        return name;
    }
}
