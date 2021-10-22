//Mi2Act3.5 - Machine Problem (3N+1)
//if the input is odd multiply it by 3 and plus 1; else if the input is even divide it by 2 
//Loop it, until the input value is 1.

import java.util.Scanner;

public class machine_problem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any positive number: ");
        int input = sc.nextInt();

        while (input != 1) {
            if (input % 2 == 0) {
                input /= 2;
            } else {
                input *= 3;
                input += 1;
            }
            System.out.println("Current value is: " + input);
        }  
        sc.close();  
    }
}
