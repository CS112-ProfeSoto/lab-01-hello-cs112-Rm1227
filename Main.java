public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!"); //Default warmup message, Yay!
        shout();            
        int sum = add(20, 189);             
        System.out.println("20 + 189 = " + sum); //simple addition printout
        Extra e1 = new Extra("CoolName"); 
            System.out.println(e1);
            Extra e2 = new Extra();
            e2.setName("CoolerName");
            System.out.println(e2.getName()); //extra class demonstration

            System.out.println(e1.equals(e2)); //compares and prints whether true or false
    }
    // void static method
    public static void shout() {
        System.out.println("Time to learn Java!");
    }
    // static method that returns some values
    public static int add(int a, int b) {
        return a + b;
    }
}
