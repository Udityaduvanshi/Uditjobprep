package Basics;

public class Test {
     public static void main(String[] args) {

         // Electricity bill calculations

          int units = 1001;
         double bill;

        if (units <= 100) {
            bill = 1.5 * units;
        }  else if (units <= 200) {
            bill = 2.5 * units;
        }
             else if (units <= 300) {
             bill = 4 * units;
        }   else{
             bill = 6 * units;
        }
             // apply discount if bill> 1000 by 10%
        if (bill >= 1000) {
            bill = bill - (bill / 10);
        }

        System.out.println("Total electricity bill: " + bill);
    }
}
