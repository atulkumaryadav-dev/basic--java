import java.util.Scanner;

public class greatestamongthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("first no : ");
        int f1=sc.nextInt();

        System.out.print("second no : ");
        int f2=sc.nextInt();

        System.out.print("third no : ");
        int f3=sc.nextInt();

        if(f1>f2 && f1>f3){
            System.out.println("f1 is greatest");
        }

        else if (f2>f1 && f2>f3) {
            System.out.println("f2 is greatest");
            
        }
        else
        {
            System.out.println("f3 is greatest");
        }
    }
    
}
