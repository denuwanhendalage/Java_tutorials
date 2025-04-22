public class Main {
    public static void main(String[] args) {
     //  Phone phone1=new Phone();  we can't create objects like this
        Samsung s1=new Samsung();
        s1.call();
        s1.sleep();
        s1.talk();
        Samsung s2=new Samsung(128,"note 20");
        System.out.println(s2.getName());
        Phone.tal();
        s1.weeek();

    }
}