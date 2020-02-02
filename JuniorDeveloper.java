package com.timurradko.itCompany;

public class JuniorDeveloper extends ProjectWorker implements  MakeCoffee, Developing{
        public boolean coffee = false;
        public String name = "Junior developer";

        protected JuniorDeveloper() {
                super(ITWorkerType.JUNIOR);
        }

        @Override
        public void developing() {
                System.out.println("I'm developing the Project such a Junior");
        }

        @Override
        public String toString() {
                return name;
        }
}
