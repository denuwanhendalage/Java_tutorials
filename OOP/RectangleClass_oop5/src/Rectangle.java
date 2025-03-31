public class Rectangle {
    double length;  //instance variable
    double width;
    static int count=0;  //instance variable(object specific)--[static]-->class specific variable


    public Rectangle(){  //default constructor
        this.length=5;
        this.width=2;
        count++;
    }
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
        count++;
    }

    public double getArea(){  //to calculate area
        return length*width;
    }
    public double getParimeter(){  //to calculate parimeter
        return 2*(length+width);
    }

}
