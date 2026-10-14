import java.util.Scanner;

public class orused {
    public static void main(String[] args) {
    

        //use of or in java ||;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if(n%5==0 || n%3==0){
            System.out.println("number is divisible by 5 or 3 ");
        }

        else{System.out.println("no divisible by 5 and 3");}
    }
    
}
