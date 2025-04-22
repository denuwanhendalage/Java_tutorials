public class Child extends Perant {
    public Child(){  //non-parameterized constructor
        //apita penune nathi unata methana thiyenawa "super();" kiyala key word ekak ekent tama perant class eke default constructor eka kreyathmaka wenne
        System.out.println("inside the default constructor of child class");
    }
    public Child(int a){  //parameterized constructor
        //apita one nm perant ge parameterized constructor eka run karaganna, then we use "super(constructor eke tiyena parameters); "
        super(a); //mehema damme nattam perant ge default constructor eka tama call wenne
        System.out.println("inside the parameterized constructor of child class");
    }
    public Child(int age,String name,int height){
        super(age,name,height);
    }
    public String getName(){
        return name;
    }





}
