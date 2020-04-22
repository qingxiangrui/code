package part2;

public class SingleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];
        int low = 0;
        int high = nums.length - 1;

        return singleNonDuplicateHalf(nums,low,high);
    }

    private Integer singleNonDuplicateHalf(int[] nums, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = low + (high - low) / 2;

        if (mid == 0 && mid + 1 < nums.length) {
            if (nums[mid] != nums[mid + 1]) {
                return nums[mid];
            } else {
                return singleNonDuplicateHalf(nums,mid + 2,high);
            }

        }

        if (mid == nums.length - 1 && mid - 1 >= 0) {
            if (nums[mid] != nums[mid - 1]) {
                return nums[mid];
            } else {
                return singleNonDuplicateHalf(nums, low, mid - 2);
            }
        }

        if (mid - 1 >= 0 && mid + 1 < nums.length) {
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            } else {
                Integer left = singleNonDuplicateHalf(nums,low,mid - 1);
                if (left != null) {
                    return left;
                }
                return singleNonDuplicateHalf(nums,mid + 1,high);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SingleNonDuplicate singleNonDuplicate = new SingleNonDuplicate();
        int[] nums = new int[]{1,1,5,3,3};
        int i = singleNonDuplicate.singleNonDuplicate(nums);
        System.out.println(i);
    }


}
