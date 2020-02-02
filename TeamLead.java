package com.timurradko.itCompany;

public class TeamLead extends ProjectWorker implements MakeCoffee, Managing, Developing {
    public String name = "Team Lead";

    protected TeamLead() {
        super(ITWorkerType.SENIOR);
    }

    @Override
    public void managing() {
        System.out.println("I'm managing the Project such a TeamLead");
    }
    @Override
    public void developing() {
        System.out.println("I'm developing the Project such a TeamLead");
    }

    @Override
    public String toString() {
        return name;
    }

}
