import java.util.Scanner;

public class threenosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first no: ");
        int x = sc.nextInt();
        
        System.out.print("Enter second no: ");
        int y = sc.nextInt();
        
         System.out.print("Enter third no: ");
        int z = sc.nextInt();

        int sum = x+y+z;
        System.out.println("Required sum :"+ sum);
    }
    
}
