package Day2;
///int sum(int a,int b){
//  return a+b;
// }
// a block of code which is execute when we call that fun
public class Methods {
    public static int a=10; //gloabl variable
    Methods(){
        a+=50; //a=60
        System.out.println(a);
    }
    public void print(int a){ //local variable
        // local power > global power
        System.out.println(a);
    }

//    public  int sum(int a,int b){
//        int sum=a+b;
//        return sum;
//    }
//
//    public static int mul(int a,int b){
//        return a*b;
//    }
    public static void main(String[] args) {
        System.out.println(a);
        Methods ob=new Methods();
        ob.print(50);
        Methods ob1=new Methods();
//        System.out.println(ob.sum(10,20));
//        System.out.println(ob.sum(20,20));
//
//        System.out.println(ob.sum(50,20));
    }


}
//10
//60
//50
//110