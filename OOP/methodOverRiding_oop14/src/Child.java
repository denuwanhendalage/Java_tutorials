public class Child extends Parent{
    @Override
    public void phone(){  //dynamic polymoprism
        System.out.println("Samsung");
    }
    @Override
    public void talk(){
        System.out.println("Hello father");
    }

}
