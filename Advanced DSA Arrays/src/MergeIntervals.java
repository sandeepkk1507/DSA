public class MergeIntervals {

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {4, 5}, {6, 7}, {8, 9}, {10, 11}};
        int s = 1;
        int e = 14;
        solution(a,s,e);
    }

    public static void solution(int[][] a, int s, int e) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int si = a[i][0];
            int ei = a[i][1];

            if (ei < s) {
                System.out.println(si + "," + ei);
            } else if (e < si) {
                System.out.println(s + "," + e);
                for (int j = i; j < n; j++) {
                    System.out.println(a[j][0] + "," + a[j][1]);
                }
                return;
            } else {
                s = Math.min(s, si);
                e = Math.max(e, ei);
            }
        }
        System.out.println(s+","+e);
    }
}
