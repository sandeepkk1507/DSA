import java.util.ArrayList;

public class BinarySortedMatrix {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        int m = A.get(0).size();
        int i = 0;
        int j = m;
        int ans = -1;
        while (i < n && j > 0) {

            if (A.get(i).get(j) == 1) {
                ans = i;
                j--;
            } else if (A.get(i).get(j) == 0) {
                i++;
            }
        }
        return ans;
    }

}
