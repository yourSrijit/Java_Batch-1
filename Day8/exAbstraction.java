package Day8;
abstract class Abstract{
    Abstract(){
        System.out.println(" hi am abstract method");
    }
    static int sum=15+20;
    static void print(){
        System.out.println("I am srijit"+sum);
    }
    abstract void mul();
}
 class Child extends Abstract{
    void mul(){
        System.out.println("This is multiplication");
    }
}

public class exAbstraction {
    void print(){
        int sum=10+5;
        System.out.println("I am srijit"+sum);
    }
    public static void main(String[] args) {
        exAbstraction ob= new exAbstraction();
        ob.print();
//        Abstract ob1=new Abstract(); we can't' create a object of a abstract class
        Child ob1=new Child();
        ob1.print();
        ob1.mul();
        Abstract ob2=new Child();

    }
}
