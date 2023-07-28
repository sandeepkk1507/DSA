import java.util.Arrays;
import java.util.HashSet;

public class FindFirstNaturalNumber {

    public static void main(String[] args) {
        int[] arr = {1,3,7,5,-1, 2};
        System.out.println("Brute force "+bruteforce(arr));
        System.out.println("HashSet "+usingHashSet(arr));
        System.out.println("Sort "+usingSort(arr));
        System.out.println("Swapping "+usingIndexOrdering(arr));

    }

    public static int bruteforce(int[] arr) {//TC: O(N2) SC: O(1)
        int index = 0;
        Boolean flag;
        for(int i = 1; i<arr.length+1; i++) {
            flag = false;
            for (int j = 0; j<arr.length; j++) {
                if (i == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if(flag == false) {
                return i;
            }

        }
        return -1;
    }
    public static int usingHashSet(int[] arr) {//TC: O(N) SC: O(N)
        HashSet<Integer> hs = new HashSet<>();
        for (int i :
                arr) {
            hs.add(i);
        }
        for (int i = 1; i< arr.length+1; i++) {
            if(!hs.contains(i)) return i;
        }
        return -1;
    }

    public static int usingSort(int[] arr) {// TC: O(NlogN)  SC: O(1)
        int mover = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <=0) {}
            else if(arr[i] == 1){
                mover = 1;
            } else if(++mover != arr[i]) {
                return mover;
            }
        }
        return -1;
    }
    public static int usingIndexOrdering(int[] arr) {// TC: O(N) SC: O(1)
        int N = arr.length;
        for (int i = 0; i<N; i++) {

            while(arr[i]<=N && arr[i]>=1 && arr[i]!=(i+1)) {
                int v = arr[i];
                if(arr[i] == arr[v-1]) break;
                int temp = arr[i];
                arr[i] = arr[v-1];
                arr[v-1] = temp;
            }
        }
        for (int i = 0; i<N; i++ ) {
            if(arr[i] != (i+1)) return (i+1);
        }

        return N;
    }
}
