package package1;

public class Employee {
    // not use any access modifier then system will assume it is a default access modifier
    //default access modifier can access only same(declaired) package
    //public access modifier can access any package or class
    //private access modifier can access only same(declaired) class
    //protected access modifier can access in subclass(it means class is extent to another class), and we can access in same(only) package
    public String name;
    public int age;
    public String department;

}

