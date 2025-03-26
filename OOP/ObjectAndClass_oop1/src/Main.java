public class Main {
    public static void main(String[] args) {
        Car car1=new Car();  //object creation

        car1.color="red";  //initialize attributes
        car1.name="toyota";
        car1.number=1234;
        car1.weight=1200.32;
        car1.speed=122;

        car1.speed(); //method calling
        car1.color();

        Car car2=new Car();  //second object creation
        Car car3=new Car();
        car2.speed();  //did not initialize value then will show zero because it is default value of integers
        car3.color();   //did not initialze value then will show null because it is default value of Strings
         car3.weight();   car3.accident();   car3.isDiesel();          //float default value is 0.0

        car2.speed=231;
        car3.color="green";
        car2.speed();
        car3.color();
    }
}