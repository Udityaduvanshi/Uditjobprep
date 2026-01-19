package Basics;

public class Test {
    public static void main(String[] args) {


        //if else easy question

        // positive or negative

        int n = 1;
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
        }






    }
}
