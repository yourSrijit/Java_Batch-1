package Day4.Inheritance;

class keypad{ //parent class super class base class
    //public private protected default
    public String sound="chaiya chaiya";
    public String battery="battery";
    public void call(){
        System.out.println("Press green to receive");
    }
}
public class Smartphone extends keypad{  //child class subclass
//    public String sound="chaiya chaiya";
//    public String battery="battery";

    String game="play game";
    String internet="turn on ";
    public void call(){
        System.out.println("Swipe up to receive");
    }

    public static void main(String[] args) {
        keypad nokia =new keypad();
        nokia.call();
        Smartphone samsung=new Smartphone();
        samsung.call();

        keypad ob=new Smartphone(); //Dynamic method dispatch  Upcasting
        ob.call();
//        Dynamic Method Dispatch in Java is the process by which a call to an overridden method is
//        resolved at runtime (during the code execution).
//        The concept of method overriding is the way to attain runtime polymorphism in Java.
//        During the code execution, JVM decides which implementation of the same method should be called.

//        Smartphone ob1=new keypad();
//        ob1.call();
    }
}
