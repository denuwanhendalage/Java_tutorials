public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.setId(123);
        System.out.println("Emp1 Id: "+emp1.getId());
        emp1.setName("kamal");
        System.out.println("Emp1 name: "+emp1.getName());

        Employee emp2=new Employee(124,"shashanka");
        System.out.println("Employee 2 ID:"+emp2.getId()+" Employee name: "+emp2.getName());

    }
}