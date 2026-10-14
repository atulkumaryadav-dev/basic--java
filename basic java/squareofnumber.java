import java.util.Scanner;

public class squareofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int square = n*n;
        System.out.println("Square is : "  + square);
    }
    
}
