import java.util.ArrayList;
import java.util.Arrays;

public class Assignment {

    public static void main(String[] args) {
        int A = 5;
//        int[][] B = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        ArrayList<Integer> temp1  = new ArrayList<>(Arrays.asList(1, 2, 10));
        ArrayList<Integer> temp2  = new ArrayList<>(Arrays.asList(2, 3, 20));
        ArrayList<Integer> temp3  = new ArrayList<>(Arrays.asList(2, 5, 25));
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        B.add(temp1);
        B.add(temp2);
        B.add(temp3);
        System.out.println("B is "+B);
        System.out.println(solve(A, B));
    }

    public static ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<A; i++) {
            arr.add(0);
        }
        for(int i = 0; i<B.size(); i++) {
            int start = B.get(i).get(0)-1;
            int end = B.get(i).get(1)-1;
            int val = B.get(i).get(2);

            int AStartValue = arr.get(start);

            arr.set(start, AStartValue+val);
            if(end+1 < A) {
                int AEndValue = arr.get(end+1);
                arr.set(end+1, AEndValue-val);
            }
        }
        for(int i = 1; i< A; i++) {
            int prev_val = arr.get(i-1);
            int cur_val = arr.get(i);
            arr.set(i, prev_val+cur_val);
        }
        return arr;
    }
}
