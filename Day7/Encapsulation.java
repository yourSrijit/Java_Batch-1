package Day7;
class Demo{
    private int age=20;
    private int cls=10;
    private void print(){
        System.out.println("my age isv"+age);
        System.out.println("muy class is "+cls);
    }
    public void setter(int age,int cls){
        this.age=age;
        this.cls=cls;
    }
    public void getter(){
       print();
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Demo ob=new Demo();
        ob.setter(50,12);
        ob.getter();

    }
}
