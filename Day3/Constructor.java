package Day3;

import java.util.concurrent.CompletionService;
import java.util.zip.CheckedOutputStream;

public class Constructor {
    int age; //=0
    String name; // = null
    int roll; //=0
    Constructor(int age,String name){
    this.age=age;
    this.name=name;
        System.out.println("1st constructor");
    }
    Constructor(int roll,int age,String name){
        this.age=age;
        this.name=name;
        this.roll=roll;

        System.out.println("Hello world");
    }
//    Constructor(int a,int b ,String c){
//
//    }
    public static void main(String[] args) {
//        Constructor amrita=new Constructor(20,"amrita");
//        Constructor supriti=new Constructor(21,"supriti");
//        Constructor sanchita=new Constructor(22,"sanchita");

        Constructor ob=new Constructor(156,21,"srijit");

//        System.out.println(amrita.age +" "+ amrita.name);
//        System.out.println(supriti.age +" "+ supriti.name);
//        System.out.println(sanchita.age +" "+ sanchita.name);
        System.out.println(ob.roll+" "+ob.age +" "+ ob.name);

    }
}
