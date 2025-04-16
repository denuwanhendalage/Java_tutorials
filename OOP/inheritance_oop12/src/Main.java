public class Main {
    public static void main(String[] args) {
        Child child1=new Child();
        child1.age=12;
        child1.weight=123;
        child1.height=123;

        System.out.println(child1.weight);
        child1.sing();
        child1.write();
        Parent2 parent2=new Parent2();
        parent2.weight=12;
        System.out.println(parent2.weight);
    }
}