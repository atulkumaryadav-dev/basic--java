import java.util.Scanner;

public class asciialphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //print the required pattern that need to be studied...

        System.out.print("Enter no of rows : ");
        int rows = sc.nextInt();

        for(int i =65;i<65+rows;i++){
            for(int j =1;j<=rows;j++){
                System.out.print((char)i+" ");

            }
            System.out.println();
        }
    }
    
}
