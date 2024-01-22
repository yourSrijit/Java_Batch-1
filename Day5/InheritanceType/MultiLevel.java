package Day5.InheritanceType;
class Parent1{
     static int a=10;
}
class Parent2 extends Parent1{
     static int b=20;
}
public class MultiLevel extends Parent2 {
    public static void main(String[] args) {
        int c=a+b;
        System.out.println(c);
    }
}
