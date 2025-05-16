package ru.bgpu.annotationlk;


public class Main {

    static {
        AppConfigWorker.configProcessing(
                "ru.bgpu.annotationlk",
                "config.properties"
        );
    }

    public static void main(String[] args) {
        new A();
        A.port = 43;
        System.out.println(new A());
    }

}
