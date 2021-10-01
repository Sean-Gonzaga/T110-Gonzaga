package Package_1;
import Package_2.vote_class;

import java.util.Scanner;

public class main_vote {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String name = scan.nextLine();

        System.out.print("Enter Age: ");
        int age = scan.nextInt();

        System.out.print("Enter Voter's ID: ");
        long id = scan.nextLong();

        vote_class obj = new vote_class(age);

        System.out.print(obj);

        System.out.print("\n[VOTER'S INFORMATION]");
        System.out.print("\nName: " + name);
        System.out.print("\nAge: " + age);
        System.out.print("\nVoter's ID: " + id + "\n");

        scan.close();
    }
}
