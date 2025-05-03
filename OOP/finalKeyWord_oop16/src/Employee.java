public  class Employee {
    final int race=10;  //final variable  (we can inherite this but we can't override
    int laps;   //instance variable
    /* final variable (not initiated) can initiated only first time using constructor  */

    public final void run(){  //final method
        System.out.println("I am running");
    }

}
