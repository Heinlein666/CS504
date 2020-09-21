package week5;

public class BubbleSortTest {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] nums = new int[] {2, 3, 1, 9, 10, 23, 11};
        nums = bubbleSort.bubbleSort(nums);

        StringBuffer sb = new StringBuffer();
        for (int num : nums) {
            sb.append(num);
            sb.append(",");
        }
        System.out.println(sb);
    }
}
