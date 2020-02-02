package com.timurradko.itCompany;

public class TeamLead extends ProjectWorker implements Manager, Developer {
    public String name = "Team Lead";

    protected TeamLead() {
        super();
    }

    @Override
    public void manage() {
        System.out.println("After I drink coffee, I will manage the Project");
    }
    @Override
    public void develop() {
        System.out.println("After I drink coffee, I will develop our program");
    }

    @Override
    public String toString() {
        return name;
    }

}
