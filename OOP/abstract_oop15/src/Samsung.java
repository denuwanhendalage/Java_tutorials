public class Samsung extends Phone{
    @Override
    public void call(){
        System.out.println("inside samsung call");

    }
    public Samsung(){

    }
    public Samsung(int storage,String modelName){
        super(storage,modelName);
    }
    public String getName(){
        return modelName;
    }




    @Override
    public void sleep(){
        System.out.println("inside samsung sleep");
    }

}
