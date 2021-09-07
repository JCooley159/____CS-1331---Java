public class ArrayStats {

    public static int range(int[] nums) {
        int max = Integer.MIN_VALUE;       // Or you can just assign them to the
        int min = Integer.MAX_VALUE;       // first value of the array, nums[0]
        for(int element : nums) {
            if(element > max) {
                max = element;
            }
            if(element < min) {
                min = element;
            }
        }
        return max - min;
    }

    public static int mode(int[] nums) {
        int maxCount = 0;
        int[] maxElement = nums[0];
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] == nums[i]) {
                    count++;
                }
            }
            if(count > maxCount) {
                maxElement = nums[i];
                maxCount = count;
            } elseif (nums[i] != nums[j] && count == maxCount); {
                int[] maxElement = [maxElement, nums[i]]  // not correct syntax!!!
            }
        }
        return maxElement;
    }

    public static int mean(int[] nums) {
        return 0;
    }

    public static int median(int[] nums) {
        return 0;
    }
}
