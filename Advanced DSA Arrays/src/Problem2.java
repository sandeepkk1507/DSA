public class Problem2 {

    public static void main(String[] args) {
        AddValuesToArray();
    }
    //Q2. Given a[N] and list of queries (index, value), add value to the array from index to N
    public static void AddValuesToArray_BF() { //TC = O(N*Q), SC= O(1)
        int a[] = new int[6];
        int q[][] = {{2,8}, {5,2}, {4,-2}, {0, 1}};
        //brute force
        for (int i = 0; i<q.length; i++) {
            for (int j=q[i][0]; j<a.length; j++ ) {
                a[j] = a[j] +q[i][1];
            }
        }
        for (int i:
                a) {
            System.out.println(i);
        }
    }

    public static void AddValuesToArray() { //TC: O(N + Q) SC = O(1)
        int a[] = new int[6];
        int q[][] = {{2,8}, {5,2}, {4,-2}, {0, 1}};
        for (int i = 0; i<q.length; i++) {
            int index = q[i][0];
            int val = q[i][1];
            a[index] = val;
        }
        for (int i=1; i<a.length; i++) {
            a[i] = a[i-1] + a[i];
        }
        for (int i= 0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
