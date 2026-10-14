public class rowwithmaxsum {
    public static void main(String[] args) {


        int maxsum=Integer.MIN_VALUE;
        int row = -1;
        int[][] array = { { 1, 2, 3 }, { 5, 7, 30 }, { 0, 9, 1 } };

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }

            if(sum>maxsum){
               
                maxsum=sum;
                row = i;
            }
        }


        System.out.println(row+"  "+maxsum);
    }

}
