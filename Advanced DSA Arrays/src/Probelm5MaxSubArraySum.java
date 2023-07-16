public class Probelm5MaxSubArraySum {

    //Kadanes algorithm
    public static void main(String[] args) {
        maxSubArray();
    }

    public static void maxSubArray() {
        int[] arr = {5, 6, 7, -3, 2, -10, -12, 8};
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0;

            }
            System.out.println(ans);
        }
    }
}
