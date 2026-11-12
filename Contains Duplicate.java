import java.util.HashSet;

class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            
            if (seen.contains(nums[i])) {
                return true;
            }
    
            seen.add(nums[i]);
        }

        
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate obj = new ContainsDuplicate();

        int[] a = {1, 2, 3, 1};
        int[] b = {1, 2, 3, 4};
        int[] c = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}; 

        System.out.println(obj.containsDuplicate(a)); 
        System.out.println(obj.containsDuplicate(b)); 
        System.out.println(obj.containsDuplicate(c)); 
    }
}