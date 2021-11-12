package com;

public class Greetings {

    public static String greet(String message){

        //replaces %s with the parameter passed
        return String.format("Hello, %s!", message);
    }

    /*
    public static void main(String[] args) {
        System.out.println(greet("hello"));
    }*/
}
