package Basics;

public class Test {
    public static void main(String[] args) {



        // hard
        // armstrong

        int numb = 153;
        int original = numb;
        int sum = 0;
        while (numb > 0) {
            int remai = numb % 10;
            sum = sum + (remai * remai * remai);
            numb = numb / 10;
        }
        if (sum == original) {
            System.out.println("armstrong number");
        } else {
            System.out.println(" is not armstrong");
        }

        // 1 to n
        for (int i = 1; i<= 1000; i++){
            int num = i;
            int sum1 = 0;

            while (num > 0) {
                int remai = num % 10;
                sum1 = sum1 + (remai * remai * remai);
                num = num / 10;
            }
            if (sum1 == i) {
                System.out.println( i + " is armstrong number");
            }

        }



        // 5 pattern
        int n = 4;
        for ( int i = 1; i <= n; i++){
            // spaces
            for( int s = n ; s > i ;s--){
                System.out.print("  ");
            }
            // star
            for (int j=1;j<=( 2*i -1);j++){
                System.out.print(" *");
            }

            System.out.println();
        }

        // num pyramid

        int n1 = 4;
        for ( int i = 1; i <= n1; i++){
            // spaces
            for( int s = n1 ; s > i ;s--){
                System.out.print("  ");
            }
            // star
            for (int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            // other side
            for (int j=i -1;j>=1;j--){
                System.out.print( j + " ");
            }

            System.out.println();
        }

        // perfect
        int n3 = 6;
        int sum2 =0;
        for (int i = 1; i < n3;i++ ){
            if ( n3 % i == 0){
                sum2 = sum2 + i;
            }
        }
        if (sum2 == n3){
            System.out.println(sum2 + " is a perfect number ");
        } else {
            System.out.println(sum2 + "is not a perfect number");
        }


        // decimal to binary

        int decimal = 25;
        int binary = 0;
        int pos = 1;

        for( ; decimal>0;decimal/=2){
            int rem = decimal % 2;
            binary = binary + rem * pos ;
            pos = pos * 10;
        }
        System.out.println("binary is : " + binary);

        // strong number

        int number = 145;
        int oringal1 = number;
        int sum3 = 0;

        while (number > 0 ){
            int remain = number % 10;
            // factorial
            int fact = 1;

            for (int i= 1; i<= remain; i++){
                fact = fact * i;
            }

            sum3 = sum3 + fact ;
            number = number / 10;
        }
        if (sum3 == oringal1){
            System.out.println(oringal1 + "  is a Strong number");
        } else {
            System.out.println(oringal1 + " is not strong number");
        }

        // pascal triangle

        int n5 = 5;
        for (int i = 0; i < n5; i++){


            int num = 1;

            for (int j = 0; j<=i; j++){
                System.out.print( num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }

        // lcm
      /*  int a = 12;
        int b = 18;

        int max =  (a>b) ? a : b;

         while (true) {
             if( max % a ==0 && max % b == 0){
                 System.out.println("lcm = " + max);
                 break;
             }
             max++;
         }*/

        //
        int a = 12;
        int b = 18;
        int lcm = 0;

        int max =  (a>b) ? a : b;

        for (int i = max; ; i++) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println("lcm = " + lcm);

        // hcf

        int no1 = 56;
        int no2 = 98;
        int gcd = 1;

        int min =  (no1 < no2) ? no1 : no2;

        for (int i = min;i >=1 ; i--) {
            if (no1 % i == 0 && no2 % i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.println("hcf of " + no1 + " and " + no2 + " is " + gcd);





    }

}









