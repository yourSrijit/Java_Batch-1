package Day6;

//1:Create a class Vehicle with attributes like make, model, and year. Then, create two subclasses, Car and Motorcycle.
//Implement appropriate constructors and methods to showcase inheritance.

class Vehicle{
    String make;
    String model;
    int py=2014;
    public int year(){
        return py;
    }
}
class Car extends Vehicle{
    Car(String make,String model,int py){
        this.make=make;
        this.model=model;
        this.py=py;
        System.out.println(make+" "+model);
    }
     public int year(){
        return py;
     }

}
class MotorCycle extends Vehicle{
    MotorCycle(String make,String model,int py){
        this.make=make;
        this.model=model;
        this.py=py;
        System.out.println(make+" "+model);
    }
    public int year(){
        return py;
    }
}
public class demo {
    public static void main(String[] args) {
        Car ob1=new Car("Suzuki","s85",2015);
        System.out.println(ob1.year());

        MotorCycle ob2=new MotorCycle("Honda","pt65",2011);
        System.out.println(ob2.year());

    }
}
