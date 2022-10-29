package exceptions;

import java.util.Scanner;

public class AgeCheckedThrow {
    void rider() throws Exception {
        System.out.println("Register Yourself for Bike Race, Please Enter Your Age :");
        Scanner age_of_Rider=new Scanner(System.in);
        int age=age_of_Rider.nextInt();
        System.out.println("Enter Your Name Rider :");
        Scanner name_of_Rider =new Scanner(System.in);
        String name=name_of_Rider.nextLine();


        if (age>20){
            System.out.println("Fill Your Details Here Rider :");
        }
        else {
            throw new Exception("You are not Eligible for participate.");
        }
    }
    public static void main(String[] args) throws Exception {

      AgeCheckedThrow ageCheckedThrow=new AgeCheckedThrow();
      ageCheckedThrow.rider();

    }
}
