import java.util.HashMap;
import java.util.Map;

public class LC1814 {
    public static void main(String[] args) {

    }
    static int countNicePairs(int[] nums) {
        int ans = 0;
        Map<Integer , Integer> map = new HashMap<>();
        for(int num : nums) {
            int val = num - rev(num);
            int counter = map.getOrDefault(val,0);
            ans += counter%10000007;
            map.put(val , counter+1);
        }
        return ans;
    }
    static int rev(int num){
        StringBuilder sb = new StringBuilder ();
        sb.append(num);
        sb.reverse();
        int ans = Integer.parseInt(sb.toString());
        return ans;
    }
}
