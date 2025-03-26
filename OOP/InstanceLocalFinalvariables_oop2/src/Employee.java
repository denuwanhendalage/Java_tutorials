public class Employee {
    String name; //instance variable
    int age;
    final String department="Maintaince";

    public void ageFinder(){ //instance method
        String a="Adult"; //local variable
        String c="Child";  //local variable
        if (age>18){
            System.out.println(a);
        }else{
            System.out.println(c);
        }
    }


}
