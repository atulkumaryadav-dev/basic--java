import java.util.Scanner;

public class triangleside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("first side in cm ");
        int s1=sc.nextInt();

        
        System.out.print("second side in cm ");
        int s2=sc.nextInt();

        
        System.out.print("third  side in cm ");
        int s3=sc.nextInt();


        if((s1+s2)>s3 && (s2+s3)>s1 && (s3+s1)>s2){
            System.out.println("they are the sides of triangle");

        }

        else{
            System.out.println("Not the sides of the triangle");
        }
    }
    
}
