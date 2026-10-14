import java.util.Scanner;

public class maxof3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 90;

        System.out.println(Math.max(Math.max(a, b),c));
        System.out.println("maximum between them is : "+Math.max(Math.max(Math.max(a, b),c),d));
    }
    
}
