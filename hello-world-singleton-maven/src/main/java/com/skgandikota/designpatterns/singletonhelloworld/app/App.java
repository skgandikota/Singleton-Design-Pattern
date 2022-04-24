package com.skgandikota.designpatterns.singletonhelloworld.app;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {

        SingleObject obj = SingleObject.getInstance();
        System.out.println(obj.executeSomethingMethodInsideSingleObject());

    }
}
