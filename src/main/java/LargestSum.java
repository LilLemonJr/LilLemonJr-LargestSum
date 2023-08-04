
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int j = 0;
        int max = nums.size() == 1 ? nums.get(0) + nums.get(1) : nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            int sum = nums.get(j) + nums.get(i);
            if (sum > max) {
                max = sum;
                if (nums.get(j) < nums.get(i)) {
                    j = i;
                }
            }
        }
        return max;
    }
}