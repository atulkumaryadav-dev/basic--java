import java.util.Scanner;

public class quadrantcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first point : ");
        int x = sc.nextInt();

         System.out.print("Enter second point : ");
        int y = sc.nextInt();

        if(x>0 && y>0){
            System.out.println("points in first quadrant");
        }

        else if (x<0 && y>0) {
            System.out.println("point in second quadrant");
            
        }

        else if (x<0 && y<0) {
            System.out.println("point in third quadrant");
            
        }

        else  {
            System.out.println("point in fourth quadrant");
        }
        

    }
    
}
