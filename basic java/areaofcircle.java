import java.util.Scanner;

public class areaofcircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius: ");
        int r = sc.nextInt();

        double area=3.14*r*r;
        System.out.println(area);


        
    }
}