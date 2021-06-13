public class FindNegative {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 50, -4, 4, -99, 76, -71},
                {80, -9, 10, -11, 12, -13, 14},
                {-19, 16, -10, 18, -55, 20, -21},
                {44, -99, 23, -74, 54, -33, 39}
        };
        find(matrix);
    }

    public static void find(int[][] matrix) {
        int cnt = 0;
        for(int i = 0; i < 4; i ++){
            for (int j = 0; j < 7; j++){
                if (matrix[i][j] > 0){
                    cnt ++;
                }
            }
        }
        System.out.println(cnt);
    }
}
