package Day6;

public class gurbageCollection {
    public void finalize(){
        System.out.println("Garbage is colleted");
    }

    public static void main(String[] args) {
    String ob1=new String("srijit");
    String ob2=new String("Bera");
    ob1=null;
    ob2=null;
    System.gc();

    }
}
