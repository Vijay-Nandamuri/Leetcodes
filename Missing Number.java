public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = 0;
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            total = total + i;
        }

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        int ans = total - sum;
        return ans;
    }

    public static void main(String[] args) {
        MissingNumber s = new MissingNumber();

        int[] a = {3, 0, 1};
        int[] b = {0, 1};
        int[] c = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println(s.missingNumber(a)); 
        
        System.out.println(s.missingNumber(b)); 
        System.out.println(s.missingNumber(c)); 
    }
}