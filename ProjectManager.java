package com.timurradko.itCompany;

public class ProjectManager extends ProjectWorker implements MakeCoffee, Managing {
    public String name = "Project Manager";

    protected ProjectManager() {
        super(ITWorkerType.SENIOR);
    }

    @Override
    public void managing() {
        System.out.println("I'm managing the Project");
    }

    @Override
    public String toString() {
        return name;
    }
}
