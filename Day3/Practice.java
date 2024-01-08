package Day3;

public class Practice {
    int x=10; //non-static
    static final int y=20; //static
    public static void main(String[] args) {
    Practice ob1=new Practice();
    ob1.x=15;
//    ob1.y=22;
        System.out.println(ob1.x); //15
        System.out.println(ob1.y); //20

        Practice ob2=new Practice();
        System.out.println(ob2.x); // 10
        System.out.println(ob2.y); // 22
        System.out.println(y);     //22
    }
}
