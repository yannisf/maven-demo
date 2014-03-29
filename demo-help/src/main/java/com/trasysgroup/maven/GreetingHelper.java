package com.trasysgroup.maven;

public class GreetingHelper {

    private String name;

    public GreetingHelper() { }

    public GreetingHelper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String createGreeting() {
        return "Hello, " + name + "!";
    }

}
