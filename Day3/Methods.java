package Day3;

public class Methods {
    public int findArea(int r){  ///non static method
        double area=3.14*r*r;
        return (int)area;
    }
    public static boolean isAdult(int age){  //static method
        if(age>18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Methods ob=new Methods();
        int result=ob.findArea(10);
        System.out.println(result);

        System.out.println(isAdult(20));

    }
}
