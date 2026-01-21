package Basics;

public class Test {
    public static void main(String[] args) {






        // switch case q

        //  days

        int day = 5;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }

        //based on month no


        int month =12;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid input");
        }

        // vowel or constent

        char ch = 'z';
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("is a constant");
        }

        //  arithmetic

        int a = 100;
        int b = 20;
        char opertor = '+';

        switch (opertor) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + (a / b));
                break;
            default:
                System.out.println("Enter Correct Arithmetic Operator");
        }


        //  grades

        int marks = 50;

        switch (marks / 10) {
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade C");
                break;
            case 6:
                System.out.println("Grade D");
                break;
            case 5:
            case 0:
                System.out.println("Grade F");
                break;
            default:
                System.out.println("Invalid Marks");
        }

        // even or oddn

        int num = 95;
        switch (num % 2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
        }


        // days in month

        int  months = 30;
        switch (months) {
            case 2:
                System.out.println(" This month has 28 and 29 days ");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This Month Has 31 Days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This Month Has 30 Days");
                break;
            default:
                System.out.println("Invalid month");
        }

        // menu driven
        int choice = 1;
        double area ;

        System.out.println("----MENU----");
        System.out.println("1. Area Of Circle");
        System.out.println("2. Area Of Rectangle");
        System.out.println("3. Area Of Triangle");
        switch (choice) {
            case 1:
                int radius = 5;
                area = 3.14 * radius *radius;
                System.out.println("Area Of circle = " + area);
                break;
            case 2:
                int length = 10;
                int breadth = 20;
                area = length * breadth;
                System.out.println("Area Of Rectangle = " + area);
                break;
            case 3:
                int base = 2;
                int height = 5;
                area = 0.5 * base * height;
                System.out.println("Area Of Trianglr = " + area);
        }

        // celsius to fahrenheit

        int choose = 2;
        double celsius = 30;
        double fahrenhiet = 40;
        double res;

        switch (choose) {
            case 1:
                res = (celsius * 9/5) + 32;
                System.out.println(res + " F");
                break;
            case 2:
                res = (fahrenhiet - 32) * 5/9;
                System.out.println( res + " C");
                break;

        }

        //

        int choices = 1;
        int submenu = 1;

        switch (choices) {
            case 1:
                System.out.println("Main Menu :  junk food");
                switch (submenu) {
                    case 1:
                        System.out.println("burger");
                        break;
                    case 2:
                        System.out.println("pizza");
                        break;
                    case 3:
                        System.out.println("cold drink");
                        break;
                }
                break;
            case 2:
                System.out.println("Main Menu : sweets");
                switch (submenu) {
                    case 1:
                        System.out.println("kaju k");
                        break;
                    case 2:
                        System.out.println("mango ras");
                        break;
                    case 3:
                        System.out.println("milk cake");
                        break;

                }
        }

        // forget break
        int i = 0;
        switch (i) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("friday");
        }
        //
        // same statement
        int s = 1;
        switch (s) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("repeating");
                break;
        }





    }

}









