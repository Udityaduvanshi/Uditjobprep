package Basics;

public class Test {
    public static void main(String[] args) {


        String Correctusername = "admin22";
        String Correctpassword = "hi";

        // input

        String username = "admin22";
        String password = "h";

        if (username.equals(Correctusername)) {
            if (password.equals(Correctpassword)) {
                System.out.println("Login Successfull");
            } else {
                System.out.println("Wrong Password");
            }
        } else {
            System.out.println("Invalid username");
        }


        //


    }
}
