import java.util.Scanner;

public class ProfileByScanner {
    public static void main(String[] args) {
        System.out.println("You can Create Your Profile Here Please Enter Your Details :");
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Your Address : ");
        String address=scanner.nextLine();
        System.out.println("Enter Your Name :");
        String name = scanner.nextLine();
        System.out.println("Enter Your Mother Name :");
        String mother_name=scanner.nextLine();
        System.out.println("Enter Your Father Name :");
        String father_name=scanner.nextLine();
        System.out.println("Enter Your Age :");
        int age =scanner.nextInt();

        System.out.println("Your Profile is Ready Please check The Details =========");
        System.out.println("Student Name is :"+name);
        System.out.println("Student Age is :"+age);
        System.out.println("Mother Name is Smt. :"+mother_name);
        System.out.println("Father Name is Mr. :"+father_name);
        System.out.println("Address of Student :"+address);




    }
}
