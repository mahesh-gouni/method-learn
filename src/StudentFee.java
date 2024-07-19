package collegeFee;
public class StudentFee {
    public static void feedue(){
        System.out.println("anybody have feedues");
    }
    public void mahesh(int amount){
        System.out.println(" mahesh paid= "+amount);
    }
    public static void manoj(int amount){
        System.out.println(" manoj paid= "+amount);
    }
    public static void gopichand(int amount){
        System.out.println(" gopi paid= "+amount);
    }


    public static void main(String[] args) {
        StudentFee mahi=new StudentFee();
        feedue();
        mahi.mahesh(20000);
        gopichand(10000);
        manoj(25000);
    }
}