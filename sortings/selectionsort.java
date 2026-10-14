public class selectionsort {

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 1, 9, 2, 6, 7, 0 };
        print(arr);

        for (int i = 0; i < arr.length - 1; i++) {

            int min = arr[i];
            int mindx=i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    // swap
                   min = arr[j];
                   mindx=j;

                }
            }

            int temp = arr[i];
            arr[i]=arr[mindx];
                arr[mindx]=temp;
            

        }
        print(arr);

    }

}
