package Day2;
// Changing one data type to another datatype
class TypeCasting {
    public static void main(String[] args) {
        // Implicit typecasting
        //Convert smaller datatype to larger datatype
        int a=10; //4 byte
        double b=a;
        System.out.println(b);

        ///Explicit typecasting
        //Convert larger datatype to smaller datatype
        double c=10.5;
        float d=(float) c;
        System.out.println(d);
    }
}
