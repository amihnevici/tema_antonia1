package com;

/**
 * Created by amihnevici on 8/4/2015.
 */
public class Hello {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void printHello(){
        System.out.println("Hello " +name);
    }
}
