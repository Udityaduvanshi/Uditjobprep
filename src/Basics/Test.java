package Basics;

public class Test {
     public static void main(String[] args) {



         // atm

        int correctpin = 4621;
        double balance = 12000;
        // input
        int pinnumber = 4621;
        double withdrawal =1300;

        if (pinnumber == correctpin && withdrawal > 0) {
            if (withdrawal <= balance) {
                System.out.println("Pin Number : " + pinnumber);
                System.out.println("Balance : " + balance);
                System.out.println("Withrawing Amount  : " + withdrawal);
                System.out.println("Remaining Balance  : " + (balance - withdrawal));
            } else {
                System.out.println("Insufficient balance");
            }
        } if ( pinnumber == correctpin && withdrawal == 0) {
            System.out.println("Pin is correct");
            System.out.println("Invalid amount number");
        }
        if  (pinnumber != correctpin) {
            System.out.println("Invalid Pin");
        }



    }
}
