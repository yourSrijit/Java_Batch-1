package Day3;

import javax.swing.*;

/*
        There have three way that we can achive method overloading
        1.number of parameter ✅
        2.type of parameter ✅
        3.order of parameter ✅
 */
public class Method_overloading {

    public static int Sum(int a,int b){
        int sum=a+b;
        return sum;
    }

//    public static void Sum(int a,int b){  In Java, Method Overloading is not possible by changing the return type of the method only
//        int sum=a+b;
//        return sum;
//    }
    public static int Sum(int a,int b,int c) {
        int sum = a + b + c;
        return sum;
    }
    public static float Sum(float a,int b){
        float sum=a+b;
        return sum;
    }
    public static float Sum(int a,float b){
        float sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
//        1.number of parameter ✅
        System.out.println(Sum(10,20));
        System.out.println(Sum(10,20,20));
//        2.type of parameter ✅
        System.out.println(Sum(10.5f,20));
//        3.order of parameter ✅
        System.out.println(Sum(10,20.5f));
    }
//    public static void main( int[] a){
//  Yes, by method overloading. You can have any number of main methods in a class by method overloading. But JVM calls main()
//method which receives string array as arguments only
//    }
}
