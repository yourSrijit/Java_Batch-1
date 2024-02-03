package Day7;
 class Parent{ // we can't give a class as private access
  private int a=10;
  protected void print(){
     System.out.println("Hello srijit");
  }
}
class Child extends  Parent{
  Child(){
      System.out.println();
//      super.print();
  }

}
class Child1 extends Child{

}
public class Access_Modifier {
    public static void main(String[] args) {
    Child ob=new Child();
    ob.print();
    Child1 ob2=new Child1();
    ob2.print();
    Parent ob1=new Child();
//    ob1.print();
    }
}
//1.Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.