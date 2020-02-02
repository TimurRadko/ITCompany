package com.timurradko.itCompany;

public class Project {
    private ITWorker[] itWorkers;

    public Project(ITWorker... itWorkers) {
        this.itWorkers = itWorkers;
    }


    public ITWorker[] getItWorkers() {
        return itWorkers;
    }

    public static void main(String[] args) {
        ITWorker[] itWorker = {
                new JuniorDeveloper(),
                new TeamLead(),
                new ProjectDeveloper(),
                new ProjectDeveloper(),
                new ProjectDeveloper(),
                new ProjectManager(),
                new QAAutomationTester(),

        };
        Project project = new Project(itWorker);
        project.workingDay(project);
    }

    public void workingDay(Project project) {
        for (ITWorker itWorker : itWorkers) {
            if (!itWorker.coffee && !(itWorker instanceof JuniorDeveloper)) {
                itWorker.coffee = true;
                System.out.println("Thank you for coffee from: "  + itWorker);
            }
        }
    }
}
