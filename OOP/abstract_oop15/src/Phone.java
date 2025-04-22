public abstract class Phone { //can't create objects from a abstract class, it means can't be instantiate object
    //if we want to use abstract class then we should inherite another class
    public abstract void call(); //abstract method ekakata body ekak na

    public abstract void sleep();

    public Phone(int storage,String modelName){
        this.storage=storage;
        this.modelName=modelName;
    }
    public Phone(){}

    protected int storage;
    protected String modelName;
    public static void tal(){
        System.out.println("we are the");
    }
    public void weeek(){
        System.out.println("we are week");
    }
    public void talk(){
        System.out.println("give a call");
    }
    // class ekak athule eka method ekak hari abstract method ekak nam class ekath abstract wiya yuthuma wee

}
