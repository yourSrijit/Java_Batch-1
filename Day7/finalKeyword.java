package Day7;
//if a class in final then we cannot inherit that class to child class
 class C{
     final int a=10;
     final public  void print(){
         System.out.println("CC");
     }

}
class D extends C{
    int a=500;
//    public void print(){   extending a parent class final method is not possible
//        System.out.println("CC");
//    }

}
public class finalKeyword {
    public static void main(String[] args) {
        D ob =new D();
        ob.print();

    }
}
//C.print()
//ob.print()