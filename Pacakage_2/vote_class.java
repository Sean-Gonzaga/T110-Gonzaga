package Package_2;

public class vote_class {
    
    int age;

    public vote_class (int age) {
        this.age = age;

        if (age >= 18) {
            System.out.print("\nCongrats!, You are Eligible to vote.\n");
        }
        else {
            System.out.print("\nSorry, You are not eligible to vote.");
        }
    }
    public String toString() {
        return " ";
    }
}
