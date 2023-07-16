import java.util.ArrayList;

public class AdvancedArrays {



    public static void main(String[] args) {

        //Q1. Given an array of integers and list fo queries (s e) , return sum of s to e for each queries
//        SumOfQueries();

    }

    //Given an array of integers and list fo queries (s e) , return sum of s to e for each queries
    public static void SumOfQueries() { //TC= O(N), SC= O(1)
        int[] arr = {2, -9, 12, 8, -5, -4};
        int[][] query = {{2, 4}, {1,2}};
        //create prefix sum
        int[] pf_sum = new int[arr.length];
        pf_sum[0] = arr[0];
        for (int i = 1; i<arr.length; i++) {
            pf_sum[i] = pf_sum[i-1] + arr[i];
        }

        for (int i = 0; i< query.length; i++) {
            int start = query[i][0];
            int end = query[i][1];
            if (start == 0) {
                System.out.println(pf_sum[end]);
            } else {
                System.out.println(pf_sum[end]-pf_sum[start-1]);
            }
        }
    }



}
