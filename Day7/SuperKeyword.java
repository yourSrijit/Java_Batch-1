package Day7;
//The super keyword in Java is a reference variable which is used to refer immediate parent class object.
//
// Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.
class A{
    int a=15;
    A(){
        System.out.println("i am A");
    }
    public  void print(){
        System.out.println(" i am inside of A");
    }
}
class B extends A{
    int a=20;
    B(){
        super(); //java compiler automatically add a super keyword at the fast statement
        System.out.println("i am B");
        System.out.println(a);
        System.out.println(super.a);
    }
    public void print(){
        super.print();
        System.out.println(" i am inside of B");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        B ob =new B();
        ob.print();

    }
}

//
//    Usage of Java super Keyword
//        1.super can be used to refer immediate parent class variable.
//       2.super can be used to invoke immediate parent class method.
//       3. super() can be used to invoke immediate parent class constructor.