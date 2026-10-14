import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number : ");
        int n = sc.nextInt();

        if(n>=1000 && n<=9999){
            System.out.println(n+ "  is 4 digit number");
        }
        else{System.out.println(n+" not a 4-digit number");}
    }
    
}
