public class passbyrefernce {

    public static void change(int[] y){
         y[2]=100;
         System.out.println(y[2]);

    }
    public static void main(String[] args) {
        int [] array = { 1, 2 , 3, 4};

        System.out.println(array[1]);
        change(array);

    }
    
}
