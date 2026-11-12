public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int curr = 0;
        int maxi = nums[0];

        for (int i = 0; i < nums.length; i++) {
            curr = curr + nums[i];

            if (curr > maxi) {
                maxi = curr;
            }

            if (curr < 0) {
                curr = 0; 
            }
        }

        return maxi;
    }

    public static void main(String[] args) {
        MaximumSubarray s = new MaximumSubarray();

        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] b = {1};
        int[] c = {5, 4, -1, 7, 8};

        System.out.println(s.maxSubArray(a)); 
        System.out.println(s.maxSubArray(b)); 
        System.out.println(s.maxSubArray(c)); 
    }
}