package by.bsu.findingMaxWay;

/**
 * Created by anyab on 25.02.2017.
 */
public class Searcher {
    public static int findWayWithMaxSum(int[][] matrix){
        for (int i = matrix.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                matrix[i][ j] += Math.max(matrix[i+1][j], matrix[i+1][j+1]);
            }
        }
        return matrix[0][0];
    }
}
