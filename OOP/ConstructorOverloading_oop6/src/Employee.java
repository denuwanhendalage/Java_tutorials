public class Employee {
    String name;
    int age;
    String department;

    public Employee(String name, int age,String department){
        this.name=name;
        this.age=age;
        this.department=department;
    }

    public Employee(String name,int age){
        this.name=name;
        this.age=age;
    }

    public Employee(String name){
        this.name=name;
    }

    public Employee(){
        
    }
    public Employee emp(){
        Employee employee=new Employee("shashanka",12,"IT");
        return employee;
    }

}
