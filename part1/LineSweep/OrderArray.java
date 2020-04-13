package part1.LineSweep;
/*
* 给你一个整数数组 nums，将该数组升序排列。
*
    1 <= nums.length <= 50000
    -50000 <= nums[i] <= 50000
* */
public class OrderArray {
    /*知道数据的范围，利用range和数组*/
    public int[] sortArray(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        int range = max - min + 1;
        int[] temp = new int[range];

        for (int num : nums) {
            temp[num - min]++;
        }

        int k = 0;
        for (int i = 0; i < range; i++) {
            while (temp[i] > 0) {
                nums[k++] = i + min;
                temp[i]--;
            }
        }
        return nums;
    }
    /*快速排序*/
    public int[] sortArray2(int[] nums) {
        quickSort(nums,0,nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int low, int high) {
        if (low >= high) return;
        int position = quickSortInternal(nums,low,high);
        if (low < position) quickSort(nums,low,position - 1);
        if (position < high) quickSort(nums,position + 1,high);
    }

    private int quickSortInternal(int[] nums, int low, int high) {
        if (low == high) return low;

        int temp = nums[low];
        while (low < high) {
            while (low < high && nums[high] >= temp) {
                high--;
            }
            nums[low] = nums[high];
            while (low < high && nums[low] <= temp) {
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = temp;
        return low;
    }

    /*归并排序*/
    public int[] sortArray1(int[] nums) {
        merge(nums,0,nums.length - 1);
        return nums;
    }

    private void merge(int[] nums, int low, int high) {
        if (low >= high) return;

        int mid = low + (high - low) / 2;
        merge(nums,low,mid);
        merge(nums,mid + 1,high);
        mergeTwoSection(nums,low,mid,high);
    }

    private void mergeTwoSection(int[] nums, int low, int mid, int high) {
        int lStart = low,rStart = mid + 1,k = 0;
        int[] temp = new int[high - low + 1];

        while (lStart <= mid && rStart <= high) {
            if (nums[lStart] <= nums[rStart]) {
                temp[k++] = nums[lStart++];
            } else {
                temp[k++] = nums[rStart++];
            }
        }

        while (lStart <= mid) {
            temp[k++] = nums[lStart++];
        }

        while (rStart <= high) {
            temp[k++] = nums[rStart++];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[low + i] = temp[i];
        }
    }
}
