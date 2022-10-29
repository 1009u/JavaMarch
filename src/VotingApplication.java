import java.util.Scanner;

public class VotingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Voting Application :");
        System.out.println("Please Enter Your Name :");
        String name = scanner.nextLine();
        System.out.println("Welcome Mr./Mrs. :" + name);
        System.out.println("You can select here your choice where you want to give your Vote");
        System.out.println("Please Select 1 for BSP , Select 2 for SP , Select 3 for Congress  and Select 4 for BJP :");
        int choice;
        choice = scanner.nextInt();
        if (choice==1){
            System.out.println("Your Vote has gone to Bahujan Samaj Party. ");
        }
        else if (choice==2){
            System.out.println("Your Vote has gone to Samajvadi Party. ");
        }
        else if (choice==3){
            System.out.println("Your Vote has gone to Congress Party. ");
        }
        else if (choice==4){
            System.out.println("Your Vote has gone to Bharatya Janata Party. ");
        }
        System.out.println("Thanks for Using Voting Application.............. " +
                "" );
    }
}
