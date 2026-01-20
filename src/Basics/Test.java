package Basics;

public class Test {
    public static void main(String[] args) {


        //if else easy question

        // positive or negative

      /*  int n = 1;
        if (n >= 0){
            System.out.println("POSITIVE NUMBER");
        } else  {
            System.out.println("NEGATIVE NUMBER");
        }

        // 2 even or odd

        int no = 15;

        if (no % 2 == 0){
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

        //3 Greater number

        int a = 100;
        int b = 200;

        if (a > b){
            System.out.println("GREATER NUMBER IS a :" + a);
        } else  {
            System.out.println("GREATER NUMBER IS b :" + b);
        }

        //4 divisible by 5

        int num = 16;

        if (num % 5 == 0){
            System.out.println("NUMBER IS DIVISIBLE BY : 5");
        } else {
            System.out.println("IS NOT DIVISIBLE BY : 5");
        }

        //5 A person is eligible or not

        int age = 18;
         if(age >= 18){
             System.out.println("ELIGIBLE TO VOTE");
         } else {
             System.out.println(" NOT ELIGIBLE");
         }

         //6 num is zero or non zero

        int i = 1;
         if (i == 0) {
             System.out.println(" IS ZERO");
         } else {
             System.out.println("IS A NON ZERO");
         }

         // vowel or constant

        char vow = 'z';

         if (vow =='a' || vow =='e' || vow =='i' || vow =='o' || vow =='u'
               ||  vow =='A' ||vow =='E' || vow =='I' ||vow =='O' ||vow =='U') {
             System.out.println("vowel");
         } else {
             System.out.println("constant");
         }

         //8 greater than 100 or not
         int c = 110;
        if ( c > 100){
            System.out.println("GREATER THAN 100");
        } else {
            System.out.println("Is Not Greater Than 100");
        }

        //9 student pass or fail
         int mar = 33;
        if (mar >= 33){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        //10 leap year

        int year = 2020;

        if  ((year % 4 == 0) && (year % 100 != 00) || (year % 400 == 0) ){
            System.out.println("LEAP YEAR");
        } else{
            System.out.println("IS not a leap year");
        }*/


        // if medium

        // find the largest or three
/*
        int a = 100;
        int b = 31;
        int c = 20;

        if ((a > b) && (a > c)){
            System.out.println("Largest Number is A : " + a);
        } else if ((b > a) && (b > c)){
            System.out.println("Largest Number is B : " + b);
        } else {
            System.out.println("Largest Number is C : " + c);
        }

      // positive negative and zero

        int d = -1;

        if (d > 0){
            System.out.println(" POSITIVE NUMBER");
        } else if (d < 0) {
            System.out.println("NEGATIVE NUMBER");
        } else {
            System.out.println("ZERO");
        }

        //3 grades

        int marks = 20;
        if(marks >= 90) {
            System.out.println("GRADE A");
        } else if (marks >= 75) {
            System.out.println("GRADE B");
        } else if (marks >= 50) {
            System.out.println("GRADE C");
        } else {
            System.out.println("FAIL");
        }

        //4 uppercase lower digit  special

        char ch = '@';

        if (ch >= 'A' && ch <= 'Z' ) {
            System.out.println("UpperCase");
        } else if (ch >='a' && ch <='z') {
            System.out.println("LowerCase");
        } else if (ch >= 0 && ch <= 9) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }

        // 5 triangle valid using its three angles

          int t = 60;
          int r = 60;
          int n = 60;

          if ((t+r+n == 180)) {
              System.out.println(" The triangle is valid ");
          } else {
              System.out.println("The triangle is not valid");
          }


        //7 simple calculator

        int i = 30;
        int j = 2;
        char operator = '*';


        if (operator == '/' ) {
             double v = (i / j);
            System.out.println( (i + " / " + j )+ " : " + v );
        } else if (operator == '*') {
              int v = i*j ;
            System.out.println( (i + " * " + j )+ " : " + v);
        } else if (operator == '+') {
             int  v = i+j;
            System.out.println( (i + " + " + j )+ " : " + v);
        } else if (operator == '-') {
            int v = i-j;
            System.out.println( (i + " - " + j )+ " : " + v);
        }

        // divisible by both 3and 5

        int no = 16;
         if (no % 3 == 0 && no % 5 == 0) {
             System.out.println( no + " is divisible by 3 and 5");
         } else {
             System.out.println( no + " is not divisible by 3 and 5");
         }

         //9 eligible for a job

        int age = 20;
         String degree ="yes";

         if ((age >= 21 ) && degree.equalsIgnoreCase("yes") ) {
             System.out.println("Is Eligible for Job");
         }else {
             System.out.println("Is not Eligible for Job");
         }

         // three side from valid triangle

         int l = 3;
         int m = 0;
         int o = 6;

         if (l + m > o && l + o > m && m + o > l ){
             System.out.println("Valid triangle");
         } else {
             System.out.println("Is not a triangle");
         }*/

        // if else hard

        int a = 5;
        int b = 5;
        int c = 5;

        if (a == b && a == c) {
            System.out.println("Equilaterals Triangle");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene");
        }

        //4 electricity
        int unit = 201;
        double bill = 0;

        if (unit <= 100) {
            System.out.println("Bill free on 100 unit ");
        } else if (unit > 100) {
            bill = 5 * unit;
        } else if (unit > 200) {
            bill = unit * 10;
        }
        System.out.println("Unit Consume : " + unit);
        System.out.println("Electricity bill : " + bill);



        // income tax

        int slabs = 600000;
        double tax = 0;

        if (slabs <= 250000) {
            tax = 0;
        } else if (slabs <= 500000) {
            tax = (slabs - 250000) * 0.05;
        } else if (slabs <= 1000000) {
            tax = (slabs - 500000) * 0.10 + 250000 * 0.05;
        }

        System.out.println(" Income : " + slabs);
        System.out.println(" Tax : " + tax);

        // menu driven

        int i = 50;
        int j = 10;
        int option = 1;

        System.out.println("----Menu----");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        if (option == 1) {
            int v = i + j;
            System.out.println((i + " + " + j) + " : " + v);
        } else if (option == 2) {
            int v = i - j;
            System.out.println((i + " - " + j) + " : " + v);
        } else if (option == 3) {
            int v = i * j;
            System.out.println((i + " * " + j) + " : " + v);
        } else if (option == 4) {
            double v = (i / j);
            System.out.println((i + " / " + j) + " : " + v);
        } else {
            System.out.println("Exit");
        }

        // date
        int date = 30;
        int month = 2;
        int year = 2020;


        if (month < 1 || month > 12) {
            System.out.println("invalid month");
        } else if (month == 2){
            if ( date < 1 || date > 29 ) {
                System.out.println("invalid date");
            } else {
                System.out.println("valid date");
            }

        }else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (date >= 1 && date <= 30) {
                System.out.println("Valid date");
            } else {
                System.out.println("invalid date ");
            }
        } else {
            if (date >= 1 && date <= 31) {
                System.out.println("Valid date");
            } else {
                System.out.println("invalid date ");
            }
        }

        //
        int salary = 10000;
        int age = 50;
        int credit = 500;

        if (age >= 21 || age <= 65) {
            if (salary >= 25000) {
                if (credit >= 500) {
                    System.out.println("LOAN approved");
                } else {
                    System.out.println("Low Credit score");
                }
            } else {
                System.out.println("Low Salary");
            }
        } else {
            System.out.println("AGE Is Low");
        }

        // quadrant

        int x = 5;
        int y = 5;

        if (x > 0 && y > 0) {
            System.out.println(x + "," + y + " Is Quadrant |");
        } else if (x < 0 && y > 0) {
            System.out.println(x + "," + y + " Is Quadrant ||");
        } else if (x < 0 && y < 0) {
            System.out.println(x + "," + y + " Is Quadrant |||");
        } else if (x > 0 && y < 0) {
            System.out.println(x + "," + y + " Is Quadrant |V");
        } else if (x == 0 && y != 0) {
            System.out.println(x + "," + y + " Y axis");
        } else if (y == 0 && x != 0) {
            System.out.println(x + "," + y + " x axis");
        } else {
            System.out.println(x + "," + y + " origin");
        }

        // palindrome

        int num = 1331;
        int temp = num;
        int res = 0;
        while (num > 0) {
            res = res * 10 + num % 10;
            num = num / 10;
        }
        if (res == temp) {
            System.out.println("palindrome");
        } else {
            System.out.println("is not palindrome");
        }
        //armstrong

        int numb = 153;
        int original = numb;
        int sum = 0;
        while (numb > 0) {
            int remai = num % 10;
            sum = sum + (remai * remai * remai);
            numb = num / 10;
        }
        if (sum == original) {
            System.out.println("armstrong number");
        } else {
            System.out.println(" is not armstrong");
        }




    }
}
