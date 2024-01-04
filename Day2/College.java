package Day2;

public class College {
    String name;
    int roll;
    static String clgName="MCKV";
    static int noOfStudent=0;
    College(){
        noOfStudent++;
        System.out.println(noOfStudent);
    }
    public static void main(String[] args) {
        College amrita=new College(); //1
        College supriti=new College(); //2
        College sanchita=new College();// 3

        System.out.println(noOfStudent);
//        amrita.name="Amrita";  //
//        amrita.roll=155;
//
//        supriti.name="Amrita";  //
//        supriti.roll=155;
//
//        sanchita.name="Amrita";  //
//        sanchita.roll=155;
//        System.out.println(amrita.clgName);
//        System.out.println(supriti.clgName);
//        System.out.println(sanchita.clgName);

    }
}
