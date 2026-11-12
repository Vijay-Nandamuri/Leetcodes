import java.util.*;

public class TWOSUM {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }


    public static void main(String[] args) {
        TWOSUM s = new TWOSUM();

        System.out.println(Arrays.toString(s.twoSum(new int[]{2, 7, 11, 15}, 9))); 
        System.out.println(Arrays.toString(s.twoSum(new int[]{3, 2, 4}, 6)));      
        System.out.println(Arrays.toString(s.twoSum(new int[]{3, 3}, 6)));         
    }
}