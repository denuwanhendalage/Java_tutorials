public interface Animal {  //every methods which are inside of interface, is a public and abstract. but we can static and default methods include body
//we can't initiate object using interface
    // interfaces haven't constructor
    //we can't contain instance fields
    //we can't extend interface
    //if we want to inherite interface we should use implement
    //we can use multiple inheritance in interfaces

    void sleep();
    void eat();


    default void newMethod(){
        System.out.println("In default method");
    }

    static void staticMethod(){
        System.out.println("In static method");
    }


}
