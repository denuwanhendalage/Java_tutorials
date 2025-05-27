class Animal{
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dog eating");
    }
    public int number;
}

class BabyDog extends Dog{
    void eat(){
        System.out.println("Babydoy eating");
    }
    public int a;
}


public class Main {
    public static void main(String[] args) {
        Animal animal1,animal2,animal3;  //object declaration
        animal1=new Animal();
        animal2=new Dog();
        animal3=new BabyDog();
        animal1.eat();
        animal2.eat();
        animal3.eat();
        Dog d=new BabyDog();
        Dog dog=(Dog) animal2;
        dog.number=21;
        d.eat();
        BabyDog bd=(BabyDog) d;
        bd.eat();
        bd.a=10;
    }
}