package com.timurradko.itCompany;

import com.timurradko.itCompany.abstractClasses.ITWorker;
import com.timurradko.itCompany.abstractClasses.QATester;

public class Project {
    private ITWorker[] itWorkers;

    public Project(ITWorker... itWorkers) {
        this.itWorkers = itWorkers;
    }

    public static void main(String[] args) {
        ITWorker[] itWorker = {
                new Trainee(),
                new TeamLead(),
                new ProjectDeveloper(ITWorkerType.JUNIOR),
                new ProjectDeveloper(ITWorkerType.JUNIOR),
                new ProjectDeveloper(ITWorkerType.MIDDLE),
                new ProjectDeveloper(ITWorkerType.MIDDLE),
                new ProjectDeveloper(ITWorkerType.MIDDLE),
                new ProjectDeveloper(ITWorkerType.SENIOR),
                new ProjectManager(),
                new QAAutomationTester(),

        };
        Project project = new Project(itWorker);
        project.workingDay(itWorker);

    }

    public static void workingDay(ITWorker[] itWorkers) {

        for (ITWorker itWorker : itWorkers) {
            if (itWorker instanceof ITWorker && !(itWorker instanceof Trainee)) {
                CoffeeMaker coffeeMaker = (CoffeeMaker) itWorker;
                coffeeMaker.makeCoffee();
                if (itWorker.coffee) {
                    System.out.println("- Thank you! - answered " + itWorker + ".");
                    if (itWorker instanceof ProjectManager) {
                        ProjectManager projectManager = (ProjectManager) itWorker;
                        projectManager.manage();
                    }
                    if (itWorker instanceof TeamLead) {
                        TeamLead teamLead = (TeamLead) itWorker;
                        teamLead.manage();
                    }
                    if (itWorker instanceof ProjectDeveloper) {
                        ProjectDeveloper projectDeveloper = (ProjectDeveloper) itWorker;
                        projectDeveloper.develop();
                    }
                    if (itWorker instanceof QATester) {
                        QATester qaTester = (QATester) itWorker;
                        qaTester.test();
                    }
                }
            }
        }
    }
}
