public class Main {
    public static void main(String[] args) {
        Child child1=new Child();
        Child child2=new Child(2);
        Child child=new Child(12,"shashanka",13);
        System.out.println(child.name);
        System.out.println(Child.getAge());;

    }
}