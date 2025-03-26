public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.age=15;
        emp1.name="Siril";

        emp1.ageFinder();   //output is Child
        emp1.age=19;
        emp1.ageFinder();  //output is Adult

        System.out.println(emp1.department);  //output is Maintaince

       // emp1.department="IT";  (give an error because we use final keyword it means can't change)
       // System.out.println(emp1.department);
    }
}