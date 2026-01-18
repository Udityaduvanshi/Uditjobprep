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

         // Exam result

        int sub1 = 32;
        int sub2 = 39;
        int sub3 = 48;
        int sub4 = 54;
        int sub5 = 63;
        boolean fail = false;

        if (sub1 >= 33) {
            System.out.println("pass in sub1 : " + sub1);
        } if (sub1 <= 33) {
            System.out.println("fail in sub1 : " + sub1);
            fail = true;
        }if (sub2 >= 33) {
            System.out.println("pass in sub2 : " + sub2);
        } if (sub2 <= 33) {
            System.out.println("fail in sub2 : " + sub2);
            fail = true;
        }if (sub3 >= 33) {
            System.out.println("pass in sub3 : " + sub3);
        } if (sub3 <= 33) {
            System.out.println("fail in sub3 : " + sub3);
            fail = true;
        }if (sub4 >= 33) {
            System.out.println("pass in sub4 : " + sub4);
        } if (sub4 <= 33) {
            System.out.println("fail in sub4 : " + sub4);
            fail = true;
        }if (sub5 >= 33) {
            System.out.println("pass in sub5 : " + sub5);
        } if (sub5 <= 33) {
            System.out.println("fail in sub5 : " + sub5);
            fail = true;
        }

        int percentage = (sub1+sub2+sub3+sub4+sub5)/ 5;
        System.out.println("Percentage : " + percentage + "%");

         if (!fail) {

             if (percentage >= 60) {
                 System.out.println("First division");
             } else if (percentage >= 45) {
                 System.out.println("Second division");
             } else if (percentage >= 33) {
                 System.out.println("Third division");
             } else {
                 System.out.println("fail");
             }
         }

        if (fail) {
            System.out.println("Result : Fail");
        } else {
            System.out.println("Result : Pass");
        }




    }
}
