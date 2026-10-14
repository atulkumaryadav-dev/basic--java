import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal amount : ");
        int p = sc.nextInt();


        System.out.print(" interest rate : ");
        int r = sc.nextInt();

        System.out.print("time : ");
        int t = sc.nextInt();

        int simpleinterest=(p*r*t)/100;
        System.out.println("required simpleinterest: "+simpleinterest);
    }
    
}
