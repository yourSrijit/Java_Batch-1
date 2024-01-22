package Day5.StringBuffer_Builder;

public class StringBuilder_ {
    public  static String createStr(StringBuilder str){
      str.append(" BEST ENGINEERING COLLEGE");
        System.out.println(str);
      return str.toString();
    }

    public static void main(String[] args) {
        StringBuilder build=new StringBuilder("Academy of Technology");

//        build.append(" for ECE");
//        StringBuilder Methods 🛑🛑🛑🛑
//          build.insert(0,"Srijit");
//        build.delete(2,7);
//        build.length()
//        build.deleteCharAt(3);
//        System.out.println(build.compareTo(build2));
//        System.out.println(build.indexOf("no")); //15
//        build.insert(5,"Srijit");

        String ans=createStr(build);
        System.out.println(ans+" Out of the method");
//        System.out.println(build.indexOf("Academy")); //0
//        System.out.println( build.lastIndexOf("Academy")); //22
        System.out.println(build);


    }
}
