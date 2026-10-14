import java.util.Scanner;

public class akapowb {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        System.out.print("ans is  : "+ pow(a, b));

    }

    public static int pow(int a, int b) {
        if (b==0)  return 1;
        int ans = a* pow(a,b-1);
        return ans;
    }
    
}
