public class oddmultipltevenindexadd {

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
        
            if(i%2==0){System.out.print(array[i]+10+" ");}
            else{System.out.print(array[i]*2+" ");}
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] array = { 1 , 2 , 3 , 6 , 9};
        print(array);

      
    }

}
