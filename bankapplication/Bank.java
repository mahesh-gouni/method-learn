package bankapplication;

public class Bank {
    public static int currentBalance=1000;
    public static void greetingPublic() {

        System.out.println("hello, Welcome to the HDFC bank");
    }
    public static void deposite(int amout){
currentBalance=currentBalance+amout;
        System.out.println("your amout deposited sucessfully ");
    }
public void withdraw(int amount){
currentBalance=currentBalance-amount;
    System.out.println("your amout is debited sucessfully ");
}
public int currentBalance(){
        return currentBalance;

}
    public static void main(String[] args) {
        Bank bank=new Bank();
        greetingPublic();
        System.out.println("your currentBalance is ="+bank.currentBalance());
        deposite(800);
        System.out.println("your currentBalance is ="+bank.currentBalance());
        bank.withdraw(700);
        System.out.println("your currentBalance is ="+bank.currentBalance());

    }
}