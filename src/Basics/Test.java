package Basics;

public class Test {
    public static void main(String[] args) {



        // for loop

        // factorial of a no
        int fact = 1;
        for (int i = 1; i <= 5; i++) {
            fact = fact * i;
            System.out.println(i + "*" + i + ":" + fact);
        }

        // check num is prime

      /*  int no1= 7;
        for (int i = 2; i <= no1-1; i++){
            if (no1 % 2 == 0){
                System.out.println("Is Not prime");
                return;
            }else {
                System.out.println("Is Prime");
                return;
            }
        }*/

        // num is prime
        int no2 = 7;
        int temp = 0;
        for (int i = 2; i<= no2-1; i++){
            if (no2 % 2 == 0){
                temp++;
            }
        }
        if (temp == 0){
            System.out.println("Number is Prime");
        } else {
            System.out.println(" Number Is not Prime");
        }

        // all prime nub 1 to 100
        for (int num = 1; num <= 100;num++) {
            int temp1 = 0;
            for (int i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    temp1++;
                }
            }
            if (temp1 == 0) {
                System.out.println(num);
            }
        }
        // reverse
        int number1= 12152;
        int reverse1 = 0;

        for (int i = number1; i!=0; i/=10){
            reverse1 = reverse1 *10 + i % 10;
        }
        System.out.println("reverse  a number " + reverse1);

        // palindrome
        int number= 121;
        int original = number;
        int reverse = 0;

        for (int i = number; i!=0; i/=10){
            reverse = reverse *10 + i % 10;
        }
        if (original == reverse){
            System.out.println( number + " is a palindrome number");
        } else {
            System.out.println("is not a palindrome number");
        }

        // sum of digits of a num
        int numb2 = 121565;
        int sum2 = 0;
        for (; numb2 >0; numb2  /= 10){
            int digit = numb2 % 10;
            sum2 = sum2 + digit;
        }
        System.out.println("sum of digits is " + sum2);

        // fabonacci

        int a =0;
        int b = 1;
        for (int i = 1;i<=10;i++){
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;
        }



        // largest number  ina number
          int numb = 121565;
          int largest = 0;
          for (; numb >0; numb  /= 10){
              int digit = numb % 10;
                      if (digit >largest){
                          largest = digit;
                      }
          }
        System.out.println( "largest no in a number  " + largest);

          // frequency

        int numb4 = 121565;
        int digitCount1 = 5;
        int count1 =0 ;
        for (; numb4 >0; numb4  /= 10){
            int digit = numb4 % 10;
            if ( digit == digitCount1){
                count1++;
            }
        }
        System.out.println("frequency of " + digitCount1 + " : " + count1);

        // pattern
        for (int i = 0; i<5;i++){
            for (int j =0;j <=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }





    }

}









