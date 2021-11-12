import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        method methods = new method();

        int choice;

        do {
            System.out.println("\n[1] Triangle");
            System.out.println("[2] Rectangle");
            System.out.println("[3] Parallelogram");
            System.out.println("[4] Circle");
            System.out.println("[5] Exit");

            System.out.print("Choice: ");
            choice = sc.nextInt();
        
                switch(choice) {
                    case 1:
                        System.out.print("\nBase: ");
                        methods.setBase(sc.nextDouble());
                        System.out.print("Height: ");
                        methods.setHeight(sc.nextDouble());

                        methods.area_Of_Tri();
                        break;
                    case 2:
                        System.out.print("\nLength: ");
                        methods.setLength(sc.nextDouble());
                        System.out.print("Width: ");
                        methods.setWidth(sc.nextDouble());

                        methods.area_Of_Rec();
                        break;
                    case 3: 
                        System.out.print("\nBase: ");
                        methods.setBase(sc.nextDouble());
                        System.out.print("Height: ");
                        methods.setHeight(sc.nextDouble());

                        methods.area_Of_Para();
                        break;
                    case 4:
                        System.out.print("\nRadius: ");
                        methods.setRadius(sc.nextDouble());

                        methods.area_Of_Cir();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Input error");
                }    

        } while(choice > 0 && choice < 5);

        sc.close();
    }
}