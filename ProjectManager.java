package com.timurradko.itCompany;

import com.timurradko.itCompany.abstractClasses.ProjectWorker;
import com.timurradko.itCompany.interfacesITWorkers.Manager;

public class ProjectManager extends ProjectWorker implements Manager {
    public String name;

    protected ProjectManager() {
        super();
        this.name = getName();
    }

    private String getName() {
        return "Project Manager";
    }

    @Override
    public void manage() {
        System.out.println("After I drink coffee, I will manage the Project");
    }

    @Override
    public String toString() {
        return name;
    }
}
