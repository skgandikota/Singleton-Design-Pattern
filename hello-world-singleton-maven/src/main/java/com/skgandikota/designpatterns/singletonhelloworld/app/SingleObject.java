package com.skgandikota.designpatterns.singletonhelloworld.app;

public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public String executeSomethingMethodInsideSingleObject() {
        return "Hello-World";
    }

}
