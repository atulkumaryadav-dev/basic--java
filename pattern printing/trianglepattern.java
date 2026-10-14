import java.util.Scanner;

public class trianglepattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
//triangle star numbers sab print ho gya hai............same method se

        System.out.print("Enter the number of rows : ");
         int n = sc.nextInt();


         for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                // System.out.print(j+" ");
                // System.out.println("*"); 
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
         }
    }
    
}
