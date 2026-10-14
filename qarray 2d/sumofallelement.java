public class sumofallelement {
    public static void main(String[] args) {

        int[][] array = { { 1, 2, 3 }, { 5, 7, 9 }, { 0, 9, 1 } };

        int sum = 0;

        for(int i =0;i<array.length;i++){
            for(int j =0;j<array[0].length;j++){
                sum+=array[i][j];
            }
        }
        System.out.println("sum of all the elements is : "+sum);

    }

}
