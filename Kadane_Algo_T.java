public class Kadane_Algo_T {
    public static void main(String[] args) {

    }
    static int maxSubArray(int[] nums) {
        int msf = Integer.MIN_VALUE, meh = 0;
        for (int i = 0; i < nums.length; i++) {
            meh = meh + nums[i];
            if (msf < meh) {
                msf = meh;
            }
            if (meh < 0) {
                meh = 0;
            }
        }
        return msf;
    }
}
