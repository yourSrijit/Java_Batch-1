package Day8;
interface grandParent{
    void fun2();
}
interface Parent extends grandParent{
    void fun();
   public static final int b=10;
     static void fun1(){
        System.out.println("Srijit bera");
    }
    private void sum(){
    }
    void fun2();
}
class B implements Parent{
    int b=50;
    public void fun(){
        System.out.println("This is a function of interface");
    }
    public void fun2(){
        System.out.println("This is fantu");
    }
}
public class Interface {
    public static void main(String[] args) {


    }
}
