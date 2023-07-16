public class Problem3 {

    public static void main(String[] args) {
        //Q3. Given a[N] and list of queries (startindex, endindex, value), add value to the array from startindex to endindex
        solution();
    }

    public static void solution() { //O(q+ N) SC= O(1)
        int a[] = new int[6];
        int q[][] = {{2, 2, 8}, {5, 5, 2}, {4, 5, -2}, {0, 2, 1}};

        for (int i = 0; i < q.length; i++) {
            int startindex = q[i][0];
            int endindex = q[i][1];
            int val = q[i][2];
            a[startindex] += val;
            if (endindex + 1 < a.length) {
                a[endindex + 1] -= val;
            }
        }
        for (int i = 1; i < a.length; i++) {
            a[i] += a[i - 1];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
