import java.lang.reflect.Array;

public class bubblesort {

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();


    }

    public static void main(String[] args) {

        // swapping adjacent element ............

        int[] arr = { 1, 0, 3, 5, 2 };
        int n = arr.length;
        print(arr);

        for(int i=0;i<n-1;i++){  

            boolean issorted = true;
            for(int j =0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    issorted=false;
                    break;
                }
            }

            if (issorted==true) { break; }
            for(int j =0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        }
        print(arr);
    }

}
