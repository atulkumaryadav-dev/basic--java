import java.util.Scanner;

public class print17table {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.print(n*i +" ");
        }
    }
    
}
