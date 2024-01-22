package Day5.StringBuffer_Builder;

public class demo {
    public  static String createStr(String str){
        str=str+" BEST ENGINEERING COLLEGE";
        System.out.println(str);
        return str;
    }
    public static void main(String[] args) {
        String ans="Academy of technology";
        System.out.println(createStr(ans));
        System.out.println(ans);
    }
}
