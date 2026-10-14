public class segregatezeroonetwopointer {
    public static void main(String[] args) {
        int[] array = { 0, 1, 0, 1, 0, 1, 0 };

        int i = 0, j = array.length - 1;

        while (i < j) {
            if (array[i] == 1 && array[j] == 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

            else if (array[i] == 0 && array[j] == 0) {
                i++;
            }

            else if (array[i] == 0 && array[j] == 1) {
                i++;
                j--;

            } else {//1 1

                j--;

            }
        }
      for(int ele:array){
        System.out.print(ele+" ");
      }
    }

}
