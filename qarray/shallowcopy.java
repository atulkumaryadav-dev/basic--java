import java.util.Arrays;

public class shallowcopy {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 5, 7 };

        // int [] x = array; //x is a shallow copy of array.....
        // x[2]=1200;
        // System.out.println(x[2]);

        int[] deep = Arrays.copyOf(array, array.length);
        deep[0] = 1000;
        System.out.println(deep[0]);

    }
}
