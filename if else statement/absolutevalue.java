import java.util.Scanner;

public class absolutevalue {
    public static void main(String[] args) {
        //print absolute value of the number....

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();

        if(x>0){
            System.out.println("absolute value of x is : " +x);
        }

        else{System.out.println("absolute value of x is : " + -(x));}
    }
    
}
