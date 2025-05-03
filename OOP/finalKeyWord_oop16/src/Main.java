public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.laps=12;
       // emp1.race=13;  we can't declare like this because race is a final attribute (variable)
        System.out.println(emp1.laps);
        System.out.println(emp1.race);

    }
}