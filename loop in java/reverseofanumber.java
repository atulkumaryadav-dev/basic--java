import java.util.Scanner;

public class reverseofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number : ");
        int n = sc.nextInt();

        // REVERSE OF THE NUMBER..........
         int original = n;
        int x = 0;
        while (n != 0) {
            x *= 10;
            x += (n % 10);
            n /= 10;

        }
        int sum= original+x;
        System.out.println("sum of number and its reverse is : "+sum);
        System.out.println("the reverse of the number is " + x);

    }

}
