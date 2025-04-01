public class Employee {
    String name;
    int age;
    static String department;  //this is class variable it is save on only one address then we assign values to that variable it is overwriting
    //mekedi wenne aluthen me variable ekata values assign karanakota kalin tibba value eka matha over write wemak tama wenne
    //static keyword eka dammama object ekak create karanne nathuwa unath call karanna puluwan
     static {
       department="it";
        System.out.println("in static block");
     }
    public Employee(){
        System.out.println("in constructor block");
    }
    public void show(){
        System.out.println(name+" "+age+" "+department+" ");
    }





}
