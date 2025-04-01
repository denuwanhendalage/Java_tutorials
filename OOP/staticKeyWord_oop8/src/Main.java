
public class Main {
    public static void main(String[] args) {
   Employee emp1=new Employee();
   Employee emp2=new Employee();
   emp1.name="kamal";
   emp1.age=15;
   emp1.department="it";
   emp2.name="nimal";
   emp2.age=16;
  // emp2.department="maintains";
   emp1.show();
   emp2.show();
   Employee.department="maintains";  //this is use for only static variables
   emp1.show();
   emp2.show();


    }
}