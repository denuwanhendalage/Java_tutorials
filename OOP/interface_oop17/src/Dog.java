public class Dog implements Animal,Animal1 {
    private int weight;
    private String breedName;
    public Dog(int weight,String breedName){
        this.weight=weight;
        this.breedName=breedName;
    }
    public void getName(){
        System.out.println(breedName);
    }
    public Dog(){}
    @Override
    public void sleep(){
        System.out.println("Dog Sleep");
    }

    @Override
    public void eat(){
        System.out.println("Dog eat");
    }
    @Override
    public void run(){
        System.out.println("Dog run");
    }




}
