package Day4.StringinJava;

import java.util.Locale;

public class String_Methods {
    public static String convert(String str){
        int n=str.length();
        char arr[]=str.toCharArray();
        for(int i=0;i<n;i++){
            if(arr[i] >=65 && arr[i] <=90 ){
                arr[i]= (char) (arr[i]+32);
            }
            else if(arr[i] >=97 && arr[i] <=122){
                arr[i]= (char) (arr[i]-32);
            }
        }
        String str1=new String(arr);
        return str1;
    }
    public static void main(String[] args) {
        String clg="Academy of Technology"; //no
        String emt="This is "; //yes
        //          0123456
//        1. charAt(index)
        System.out.println(clg.charAt(12));
//        2.length()
        System.out.println(clg.length());
//        3.substring
        System.out.println(clg.substring(5));
        System.out.println(clg.substring(5,12));
        String sub=clg.substring(10);
//        4.contains()
        System.out.println(clg.contains("e"));
//        5.concat()
        String emp=emt.concat(clg);
        System.out.println(emp);
//        6.replace()
        System.out.println(clg.replace("c","x"));
        //indexOf("c") =1
//        7.toLowerCase()
        System.out.println(clg.toLowerCase());
//        8.toUpperCase()
        System.out.println(clg.toUpperCase());

        System.out.println(convert(clg));


    }
}
