public class maximumelement {
    public static void main(String[] args) {
        int[][] array = { { 1, 2, 3 }, { 5, 7, 40 }, { 0, 9, 1 } };

        int max = array[0][0];

        for(int i =0;i<array.length;i++){
            for(int j =0;j<array[0].length;j++){

                if(array[i][j]>max){
                    max=array[i][j];
                }
            }
        }
        System.out.println("maximum elemnt is : "+max);
    }

}
