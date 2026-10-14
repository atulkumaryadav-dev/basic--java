public class rotatearray {

    public static void reverse(int[] array, int i, int j) {

        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        System.out.println();
    }


    public static void print(int[] array) {
        for (int elemenet : array) {
            System.out.print(elemenet + " ");
        }
    }

    public static void rotate(int[] array, int r) {

        r = r % array.length;

        reverse(array, 0, r - 1);
        reverse(array, r, array.length - 1);
        reverse(array, 0, array.length - 1);
    }
       public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5 };
        int r = 2;

        rotate(array, r);
        print(array);

    }

}
