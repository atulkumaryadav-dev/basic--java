import java.util.Scanner;

public class Maxoftwo {
    public static int Maxof(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        System.out.print("Enter theSECOND number : ");
        int b = sc.nextInt();
        System.out.println("maximum between the two numbers is : " + Maxof(a, b));

    }

}
