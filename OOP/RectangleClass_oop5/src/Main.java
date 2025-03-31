public class Main {
    public static void main(String[] args) {
        Rectangle rec1=new Rectangle();
        System.out.println("rec1: "+Rectangle.count); //count value is 1 for instance variable
        Rectangle rec2=new Rectangle(5,4);
        System.out.println("rec2: "+Rectangle.count);  //count value is 1 for instance variable then 2 for class variable(static variable)
        Rectangle rec3= new Rectangle(10,5.3);
        System.out.println("rec3: "+rec3.count);  //count value is 1 for instance variable then 3 for class variable(static variable)

        Rectangle r1=new Rectangle();
        System.out.println(r1.width);

        rec1.width=12;
        rec1.length=10;
        System.out.println("Rectangalar1 area:"+rec1.getArea());

        System.out.println("Recangalar2 area:"+rec2.getArea());

        System.out.println("Rectangular3 area:"+ rec3.getArea());


        rec1.length=1;
        rec1.width=2;
        System.out.println("After changing values Rectangalar1 area:"+rec1.getArea());
    }
}