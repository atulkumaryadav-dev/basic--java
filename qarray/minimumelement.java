public class minimumelement {
    public static void main(String[] args) {
        
        int [] array = {20, 80, 1, 50};
        int min = array[0];

        for(int i =0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }

        }
        System.out.println("the minimum element : "+min);
    }
    
}
