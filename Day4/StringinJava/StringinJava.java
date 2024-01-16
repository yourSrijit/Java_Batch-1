package Day4.StringinJava;
import com.sun.source.tree.LiteralTree;

import java.lang.String;
public class StringinJava {
    public static void main(String[] args) {
//        char arr[]="srijit";
        String arr="Srijit";
//        There have two way to create String
//        1.using String Literal

        String a="Academy of technology";
        String b="Academy of technology";
        System.out.println( a==b); //true (== memory address is same)
        System.out.println(a.equals(b)); // true check the value not the address
//        2.using new keyword
        String c=new String("Academy of technology");
        String d=new String("Academy of technology");
        System.out.println(c==d); //false (== memory address issame)
        System.out.println(c.equals(d)); // true check the value not the address


    }
}
