public class productofarrayelemnet {
    public static void main(String[] args) {
        
        int[] array = {1, 2 , 3 , 10};

        int product = 1;
        for(int i = 0;i<array.length;i++){
            product*=array[i];

        }
        System.out.println(product);
    }
    
}
