import java.util.Scanner;

public class araisetob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        System.out.print(a +" raise to the power "+ b +" is " + pow(a, b));

    }

    public static int pow(int a, int b) {
        if (b == 0)
            return 1;

        int x = pow(a, b / 2);
        int y = pow(a, b / 2);
        if (b % 2 == 0) {return  x * x; } 
        else { return  a * y *y; }

// logirithmic time complexity................
    }

}
