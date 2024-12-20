package com.charan;

public class Alien {

    private int age;
    private Computer com;

//    public Alien(int age)
//    {
//        this.age = age;
//    }
//    public Alien(int age, Computer com)
//    {
//        this.age = age;
//        this.lap = lap;
//    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }


//    public Laptop getLap() {
//        return com;
//    }
//
//    public void setLap(Laptop lap) {
//        this.com = lap;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Alien()
    {
        System.out.println("Alien object created.................!");
    }
    public void writeCode()
    {
        System.out.println("Coding...............");
        com.compile();

    }

}
