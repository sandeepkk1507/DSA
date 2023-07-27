public class SumOfAllSubMatrixSums {

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}, {2, 4, 6, 5}, {6, 8, 2, 3}};
        int n = mat.length;
        int m = mat[0].length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //formula
                sum += mat[i][j] * (i + 1) * (j + 1) * (n - i) * (m - j);
            }
        }
        System.out.println(sum);

    }
}
