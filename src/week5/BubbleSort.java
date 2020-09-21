package week5;

public class BubbleSort {
    public int[] bubbleSort(int[] nums) {
        int len = nums.length;
        if (len <= 1){
            return nums;
        }

        for (int i = 0; i < len; i++) {
            boolean flag = false;
            for (int j = 0; j < len - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tem = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = tem;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return nums;
    }
}
