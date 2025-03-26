public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee(); //non-parametarized constructor
        emp1.name="shashanka";
        emp1.age=19;
        emp1.department="IT";
        System.out.println(emp1.name+" "+emp1.age+" "+emp1.department);

        Employee emp2=new Employee("Nimal",12,"Maintains");
        System.out.println(emp2.name+" "+emp2.age+" "+emp2.department);

        Employee emp3=new Employee("Kamal",34);
        System.out.println(emp3.name+" "+emp3.age);

        Employee emp4=new Employee("Ramal",46);
        System.out.println(emp4.name+" "+emp4.age+" "+emp4.department);
    }
}