public class Employee {
    private int id;
    private String name;

    //getter for get data->return
    //setter for set data->use parameters
    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    public Employee(){

    }
    public void setId(int id){  //id setter
        this.id=id;
    }
    public int getId(){  //id getter
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
