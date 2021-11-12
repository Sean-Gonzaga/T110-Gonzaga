public class method extends data{

    double solve_Area_Of_T;
    double solve_Area_Of_R;
    double solve_Area_Of_P;
    double solve_Area_Of_C;
    double pi = 3.14;

    public void area_Of_Tri() {
        solve_Area_Of_T = (getBase() * getHeight() / 2);
        System.out.println("Area of Triangle: " + solve_Area_Of_T);
    }

    public void area_Of_Rec() {
        solve_Area_Of_R = (getLength() * getWidth());
        System.out.println("Area of Rectangle: " + solve_Area_Of_R);
    }

    public void area_Of_Para() {
        solve_Area_Of_R = (getBase() * getHeight());
        System.out.println("Area of Parallelogram: " + solve_Area_Of_R);
    }

    public void area_Of_Cir() {
        solve_Area_Of_C = (pi * (radius * radius));
        System.out.println("Area of Circle: " + solve_Area_Of_C);
    }

}
