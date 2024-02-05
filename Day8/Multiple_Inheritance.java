package Day8;
interface mother{
    void cook();
}
interface father{
    void cook();
}
class child1 implements mother,father{
    public void cook(){
        System.out.println(" i can cook");
    }
    public void job(){
        System.out.println(" i can go for job");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        child1 ob=new child1();
        ob.cook();
        ob.job();

    }
}
