package com.example.csc250_fall2019_employeemanager;

public class Employee
{
    private String fname;
    private String lname;
    private int height_feet;
    private int height_inches;
    private int age;
    private double weight;

    public Employee(String fname, String lname, int height_feet, int height_inches, int age, double weight)
    {
        this.fname = fname;
        this.lname = lname;
        this.height_feet = height_feet;
        this.height_inches = height_inches;
        this.age = age;
        this.weight = weight;
    }

    public void changeFname(String a)
    {
        this.fname = a;
    }

    public String getFname() {
        return fname;
    }

    public void changeLname(String a)
    {
        this.lname = a;
    }

    public String getLname() {
        return lname;
    }

    public void changeHeight_feet(int a)
    {
        this.height_feet = a;
    }

    public int getHeight_feet() {
        return height_feet;
    }

    public void changeHeight_inches(int a)
    {
        this.height_inches = a;
    }

    public int getHeight_inches() {
        return height_inches;
    }

    public void changeAge(int a)
    {
        this.age = a;
    }

    public int getAge() {
        return age;
    }

    public void changeWeight(double a)
    {
        this.weight = a;
    }

    public double getWeight() {
        return weight;
    }
}
