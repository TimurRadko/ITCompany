package com.timurradko.itCompany;

import com.timurradko.itCompany.abstractClasses.ProjectWorker;
import com.timurradko.itCompany.interfacesITWorkers.Developer;

public class ProjectDeveloper extends ProjectWorker implements Developer {
    public String name;
    protected ITWorkerType workerType;

    protected ProjectDeveloper(ITWorkerType workerType) {
        super();
        this.workerType = workerType;
        this.name = getName();
    }

    public String getName() {
        return name;
    }

    private void setName(ITWorkerType workerType) {
        if (workerType == ITWorkerType.JUNIOR) {
            this.name = "Junior Developer";
        }
        if (workerType == ITWorkerType.MIDDLE) {
            this.name = "Middle Developer";
        }
        if (workerType == ITWorkerType.SENIOR) {
            this.name = "Senior Developer";
        }
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
