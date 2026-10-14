public class secondmaxelement {
    public static void main(String[] args) {

        int[] array = { 10, 20, 50, 11 };
        int max = array[0];
        int secmax = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("the maximum element is : "+max);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > secmax && array[i] < max) {

                secmax = array[i];

            }
        }
        System.out.println("the second maximum elemenet is : "+secmax);
    }
}
