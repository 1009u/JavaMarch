package exceptions;

import java.util.Scanner;

public class CustomExcepDemo {
    void voteAge(){
        System.out.println("Welcome ot Voting App Please Enter Your Age :");
        Scanner age_of_voter= new Scanner(System.in);
        int age= age_of_voter.nextInt();
        if (age>18){
            System.out.println("Enter Your Name :");
        }
        else {
            System.out.println("Sorry You are not eligible for voting.... ");
        }
    }
    public static void main(String[] args) {
        CustomExcepDemo obj=new CustomExcepDemo();
        obj.voteAge();
    }
}
