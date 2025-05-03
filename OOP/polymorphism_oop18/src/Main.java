class Bike{
    void run(){
        System.out.println("Bike is running");
    }
}
class Yamaha extends Bike{
    void run(){
        System.out.println("Yamaha bike is running");
    }
    public void break1(){
        System.out.println("Yamaha bike is breaking");
    }
}

public class Main {  //runtime polymorphism -->dynamic method dispatch
    public static void main(String[] args) {
        Bike bike1=new Yamaha();  //declaration is using Bike class and object is created by using Yamaha class. it is upcasting
        bike1.run();  //bike1 is referenced by Bike class, overriding process will start at runtime

        //downcasting
        Yamaha a=(Yamaha) bike1; // bike1 object cast to Yamaha object and refer to the Yamaha 'a ' abject
        a.break1();

    }

}