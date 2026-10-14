import java.util.Scanner;

public class breakcontinue {
    public static void main(String[] args) {
        // number prime or not......

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        boolean flag = true;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }

        }
    
         if(n==1){System.out.println("neither prime nor composite");}
        else if(flag==true){System.out.println("prime");}
        else if(flag==false){System.out.println("composite");}
    }
}

