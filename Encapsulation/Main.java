import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        data obj = new data();

        System.out.println("\n[Input Personal Data]");
        System.out.print("Full Name: ");
        obj.setName(sc.nextLine());
        System.out.print("Phone Number: ");
        obj.setNumber(sc.nextLine());
        System.out.print("Address: ");
        obj.setAddr(sc.nextLine());
        System.out.print("Age: ");
        obj.setAge(sc.nextLine());

        System.out.println("\n[Input Grades]");
        System.out.print("Math: ");
        obj.setGrade_Math(sc.nextLine());
        System.out.print("Science: ");
        obj.setGrade_Science(sc.nextLine());
        System.out.print("English: ");
        obj.setGrade_English(sc.nextLine());
        System.out.print("History: ");
        obj.setGrade_History(sc.nextLine());
        System.out.print("P.E.: ");
        obj.setGrade_PE(sc.nextLine());

        System.out.println("\n-Student Data-");
        System.out.println(obj.getName());
        System.out.println(obj.getNumber());
        System.out.println(obj.getAddr());
        System.out.println(obj.getAge());
        System.out.println("\n-Student Grades-");
        System.out.println(obj.getGrade_Math());
        System.out.println(obj.getGrade_Science());
        System.out.println(obj.getGrade_English());
        System.out.println(obj.getGrade_History());
        System.out.println(obj.getGrade_PE());

        sc.close();
    }
}