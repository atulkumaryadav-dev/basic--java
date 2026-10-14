import java.util.Scanner;

public class loweralphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of rows : ");
        int rows = sc.nextInt();

        for(int i=0;i<rows;i++){
           for( int j = 97;j<rows+97;j++){
            System.out.print((char)j+" ");
           }
           System.out.println();
        }
    }
    
}
