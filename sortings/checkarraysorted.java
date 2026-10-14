public class checkarraysorted {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < array.length-1; i+=2) {
            if (array[i] < array[i+1]) {
             
                System.out.println("array is sorted : ");
                break;
              
            }
            else{System.out.println("not sorted ");}
            break;
            
        }

    }
}