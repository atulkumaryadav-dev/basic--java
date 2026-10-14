import java.util.Scanner;

public class displayap {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

       int a =2, d=3;

        for(int i =2;i<=a+(n-1)*d;i+=3){
            System.out.print(i +" ");
        }
    }
    
}
