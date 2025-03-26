public class Employee {
    String name;
    int age;
    String department;

   // Employee(){  //non- paramitarized constructor (Java makes default constructor when programmer didn't make any constructor)
  //  }
    public Employee(String name,int age,String department){  //parametaraized constructor
        this.name=name;
        this.age=age;
        this.department=department;
    }
    public Employee(){
         this.name="Employee";
         this.age=25;
         this.department="IT";
     }

    public Employee(String name,int age){
         this.name=name;
         this.age=age;
    }


}
