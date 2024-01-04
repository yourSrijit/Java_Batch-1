package Day2;

public class Loops {
    public static void main(String[] args) {
        // while -> entry control loop
        // do-while -> exit control loop
        //for loop
        //for each loop

        int myAge=20;
        while(myAge>10){//20 18 16 14 12
            myAge=myAge-2;
            if(myAge==14){
                System.out.println("Greater than 10");
                continue;
            }
        }

//        do{
//            System.out.println("Greater than 10");
//            myAge=myAge-2;
//        }while (myAge>=10); // 18 16 14 12 10 8


        //for -loop
//        8 multiplication  table
        for(int i=1;i<=10;i++){
            System.out.println("8 X "+i +" = "+(8*i));
        }

        int arr[]=new int[10]; //
//        for(int i=0;i<10;i++){
//            System.out.println(arr[i]);
//        }

        //for -each loop
        for(int element:arr){
            System.out.println(element);
        }

    }
}
