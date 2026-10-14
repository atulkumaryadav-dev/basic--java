import java.util.Scanner;

public class rectanglepattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

      System.out.print("Enter no. of rows : ");
        int rows=sc.nextInt();

        System.out.print("enter thr no. of column : ");
        int column= sc.nextInt();


        for(int i = 0;i<rows;i++){ //kitni lines hogi...
            for(int j =0;j<column;j++){//har line me kitne stars honge
                System.out.print(" * ");
            }   
            System.out.println();
            
        }

    }
}