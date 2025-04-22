public class Perant {
    private static int age;
    protected String name;
    private int height;

    public Perant(int age, String name,int height){
        this.age=age;
        this.name=name;
        this.height=height;
        System.out.println("this is a Perant three parameter constructor");
    }

    public Perant(){
        System.out.println("inside the default constructor of parent class");
    }

    public Perant(int age){
        this.age=age;
        System.out.println("inside the parameterized constructor pf parent class");
    }
    public static int getAge(){
        return age;
    }

}
