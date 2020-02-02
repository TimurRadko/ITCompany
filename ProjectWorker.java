package com.timurradko.itCompany;

public abstract class ProjectWorker extends ITWorker implements MakeCoffee {
    protected ITWorkerType typeWorker;

    protected ProjectWorker(ITWorkerType typeWorker) {
        super(false);
        this.typeWorker = typeWorker;
    }
}
