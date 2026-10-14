import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        // input of array element .........

        // for(int i =0 ;i<n;i++){
        // array[i]=sc.nextInt();
        // }

        int i = 0;
        while (i < n) {
            array[i] = sc.nextInt();
            i++;
        }

        // output......

        // for( i =0;i<n;i++){
        // System.out.println(array[i]);
        // }
        i = 0;
        while (i < n) {
            System.out.print(2*(array[i])+" ");
            i++;

        }

    }

}
