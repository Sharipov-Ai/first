import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int x1 = 3;
        int y1 = 5;
        createMatrix(x,y);
        System.out.println("-----------");
        createMatrix(x1,y1);
    }

    public static void createMatrix(int x, int y){
        int[][] matrix = new int[x][y];
        for (int i = 0; i < x; i ++){
            for (int j = 0; j < y; j++){
                matrix [i][j] = (int)(Math.random() * 10);
            }
        }
        for (int[] n: matrix){
            System.out.println(Arrays.toString(n));
        }
    }
}
