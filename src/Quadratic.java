import java.util.Scanner;

public class Quadratic {
public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    int a, b, c;

    System.out.println("Enter a: ");
    a = input.nextInt();
    System.out.println("Enter b: ");
    b = input.nextInt();
    System.out.println("Enter c: ");
    c = input.nextInt();
//int math = 0;
    double Qp;
    double Qn;
    Qp = -b + (Math.sqrt((4*a*c)/2*a));
    Qn = -b - (Math.sqrt((4*a*c)/2*a));


    System.out.println("The Quadratic result of Qp is: " + Qp);
    System.out.println("The Quadratic result of Qn is: " + Qn);



}
}
