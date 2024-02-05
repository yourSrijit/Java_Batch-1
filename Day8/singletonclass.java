package Day8;

class Parent1{
    public int a=10;
    private Parent1(){

    }
   public static Parent1 ob=new Parent1();
    public static Parent1 getInstance(){
        return ob;
    }

}
public class singletonclass {
    public static void main(String[] args) {

      Parent1 object=Parent1.getInstance();
        System.out.println(object.a);
    }
}
