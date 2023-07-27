public class SumOfSubMatrixQueries {

    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4}, {2,4,6,5}, {6,8,2,3}};
        int[][] queries = {{0,1,2,3}, {1,1,2,2}};
        int m = mat.length;
        int n = mat[0].length;
        System.out.println("m is "+m);
        System.out.println("n is "+n);
        mat = prefix(mat, m, n);
        queries(queries, mat);
    }
    public static int[][] prefix(int[][] arr, int m, int n) {
        for (int i = 0; i< m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
        for (int i = 1; i < m ; i++) {
            for (int j = 0; j<n; j++) {
                arr[i][j] = arr[i-1][j] + arr[i][j];
            }
        }

        for (int j = 1; j <n; j++) {
            for(int i = 0; i<m; i++) {
                arr[i][j] = arr[i][j-1] + arr[i][j];
            }
        }
        for (int i = 0; i< m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
        return arr;
    }

    public static void queries(int[][] q, int[][] arr) {
        int sum = 0;
        for (int i = 0; i< q.length; i++) {
            sum =0;
            int x1 = q[i][0];
            int y1 = q[i][1];
            int x2 = q[i][2];
            int y2 = q[i][3];


            sum += arr[x2][y2];
            if(y1>0) {
                sum -= arr[x2][y1-1];
            }
            if(x1 > 0) {
                sum -= arr[x1-1][y2];
            }
            if (x1>0 && y1>0) {
                sum += arr[x1-1][y1-1];
            }
            System.out.println(sum);

        }
    }
}
