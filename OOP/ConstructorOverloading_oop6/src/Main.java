
public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee("nimal",14,"it");
        Employee emp2=new Employee("kamal",25);
        Employee emp3=new Employee("samal");
        Employee emp4=new Employee();
        System.out.println(emp1.name+" "+emp1.age+" "+emp1.department);
        System.out.println(emp2.name+" "+emp2.age+" "+emp2.department);
        System.out.println(emp3.name+" "+emp3.age+" "+emp3.department);
        System.out.println(emp4.name+" "+emp4.age+" "+emp4.department);
        emp4=emp4.emp();
        System.out.println(emp4.name+" "+emp4.age+" "+emp4.department);

    }
}