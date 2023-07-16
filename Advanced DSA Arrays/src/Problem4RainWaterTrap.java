public class Problem4RainWaterTrap {

    public static void main(String[] args) {
        water();
    }

    public static void water() {//TC: O(N), SC: O(N)
//        int[] a1 = {4, 2, 5, 7, 4, 2, 3, 6, 8, 2, 3};
        int[] a = {56,6,52,43,23,47,48,38,96,46,30,66,80,15,62,71,61,12,98,9,28,81,70,59,95,34,9,60,70,81,71,67,58,20,22,3,95,85,20,24,74,5,23,33,75,50,38,75,68,26,46,30,75,18,4,42,51,59,8,77};
        int n = a.length;
        int[] leftmax = new int[n], rightmax = new int[n];
        leftmax[0] = a[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], a[i]);
        }
        rightmax[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], a[i]);
        }
        int[] support = new int[n];
        support[0] = support[n - 1] = 0;
        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            int lm = leftmax[i - 1];
            int rm = rightmax[i + 1];
            support[i] = Math.min(lm, rm);
            int water = Math.max(support[i] - a[i], 0);
            ans += water;
        }
        System.out.println(ans);
    }
}
