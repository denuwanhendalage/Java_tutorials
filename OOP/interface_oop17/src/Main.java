public class Main {  //if we want multiple inheritance we should use interfaces
    public static void main(String[] args) {
       // Animal animal1=new Animal();  we can't create objects because Animal is interface
        Dog dog1=new Dog();
        dog1.eat();

        dog1.sleep();
        dog1.newMethod();
        Animal.staticMethod();
        dog1.run();
        Dog dog2=new Dog(12,"weee");
        dog2.getName();
    }
}