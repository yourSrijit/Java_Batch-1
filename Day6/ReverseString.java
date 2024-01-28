package Day6;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String str){
        int l=str.length();
        StringBuilder s=new StringBuilder("");
//        String s="";
        for(int i=l-1;i>=0;i--){
            s=s.append(str.charAt(i));
        }
    return s.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder ob=new StringBuilder("sriijit");
        ob.reverse();
        String ans=reverseString(str);
        System.out.println(ans);
    }
}
