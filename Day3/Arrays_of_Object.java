package Day3;

import java.util.Scanner;

public class Arrays_of_Object {
    int roll;
    String name;
    int age;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//    int arr[]=new int[100];
        System.out.println("Please enter the number of employee");
        int num=sc.nextInt();

    Arrays_of_Object ob[]=new Arrays_of_Object[num]; //ob[0] ob[1] ob[2]

//        Arrays_of_Object ob1=new Arrays_of_Object();
//        Arrays_of_Object ob2=new Arrays_of_Object();
//        Arrays_of_Object ob3=new Arrays_of_Object();
        for(int i=0;i<num;i++){
            ob[i] = new Arrays_of_Object();
            System.out.println("Enter roll of employee no "+(i+1));
            ob[i].roll=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name of employee no "+(i+1));
            ob[i].name=sc.nextLine();
            System.out.println("Enter age of employee no "+(i+1));
            ob[i].age=sc.nextInt();
        }
        System.out.println("Name\t" +" "+"Age"+" "+"Roll");
        for (int i=0;i< num;i++){
            System.out.println(ob[i].name+" "+ob[i].age+" "+ob[i].roll);
        }
    }
}
