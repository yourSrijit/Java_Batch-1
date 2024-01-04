package Day2;
// c++ =c with class


public class Class_Object {
    //Constructor is a special kind of method whose name is as the same as the class name
    // which is invoked when we create an object of that class
    static int a=10;
    Class_Object(){
        System.out.println(++a);
    }
    public static void main(String[] args) {
        // class-name obj=new classname()  {constructor};
        Class_Object ob=new Class_Object(); // a=10
        Class_Object ob1=new Class_Object(); // a=10
        Class_Object ob2=new Class_Object(); //a=10

    }
}
