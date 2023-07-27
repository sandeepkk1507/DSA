public class TwoQuestion1 {

    public static void main(String[] args) {
        //Q1. For a given Matrix N*M and Queries (TL and BR), find the sum of sub matrix
        SubMatrixSum();
    }

    public static void SubMatrixSum() {
        int a[][] = {{1,2,3}, {2,4,6}, {6,8,2}};
        int m = a.length;
        int n = a[0].length;
        //build prefix matrix first
        int pf[][] = new int[m][n];

        for(int i = 0; i<m; i++) {
            int sum = 0;
            for(int j = 0; j<n; j++) {
                sum+= a[i][j];
            }
            System.out.println(sum);

        }
    }
}