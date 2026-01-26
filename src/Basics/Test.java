package Basics;

public class Test {
    public static void main(String[] args) {



        // for loop
        // easy question

        // 1 to n

        int n = 4;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // n to 1

        int N = 5;
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
        //  EVEN NUMBER  1 TO 100


        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // odd  1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // sum of  first n  nature

        int n1 = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            //sum += i;
        }
        System.out.println(sum);

        //  multiplication  table
        int tab = 5;
        int sum1 = 0;

        for (int i = 1; i <= 10; i++) {
            sum1 = tab * i;
            System.out.println(tab + " * " + i + " = " + sum1);
        }

        // count the number of digit in no

        int n2 = 552512;
        int count = 0;
        for (int i = n2; i != 0; i /= 10) {
            count++;
        }
        System.out.println(count);

        // squre of number
        int n3 = 5;
        for (int i = 1; i <= n3; i++) {
            System.out.println(i + ":" + (i * i));
        }

        // divisible byv 5 1to 100
        int divi = 5;
        for (int i = 1; i <= 100; i++) {
            if (i % divi == 0) {
                System.out.println(i);
            }
        }

        // asc|| value of character Ato Z
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            int ascii = (int) ch;
            System.out.println(ch + " = " + ascii);
        }





    }

}









