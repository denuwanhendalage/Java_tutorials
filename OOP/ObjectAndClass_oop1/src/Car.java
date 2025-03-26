public class Car {
    int number; //instance variables (attributes)  default access modifier is default
    String name;
    String color;
    double weight;
    int speed;
    boolean isAccident;
    char petrolOrDiesel;

    public void speed(){ //instance methods
        System.out.println(speed);
    }
    public void weight(){
        System.out.println(weight);
    }
    public void accident(){
        System.out.println(isAccident);
    }
    public void isDiesel(){
        System.out.println(petrolOrDiesel);
    }

    public void color(){
        System.out.println(color);
    }


}
