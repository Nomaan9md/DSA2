package BinarySearch;
/// 540. Single Element in a Sorted Array
/*
* You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element
which appears exactly once. Return the single element that appears only once.
Your solution must run in O(log n) time and O(1) space.

Example 1:
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
*
* */
/*
* Logic In the sorted array:
        ----> All elements appear in pairs except one single number.
        ----> Before the single number, pairs start at even indices:
        ----> nums[even] == nums[even + 1]

After the single number, this pattern breaks.
➡ So we use binary search to find where the pairing pattern breaks.

Steps to Follow
   1) Set low = 0 and high = n - 1.
   2) Find mid = (low + high) / 2.
   3) Make sure mid is even (if odd → mid--).

Compare:
   --> If nums[mid] == nums[mid + 1] → pattern is correct → go right
   --> low = mid + 2
   --> Else → pattern is broken → single element is at or before mid
   --> high = mid
   --> Repeat until low == high.
   --> Return nums[low] — that is the single element.

*/
public class problem4 {

    public static int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // make mid even
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};

        int result = singleNonDuplicate(arr);

        System.out.println("Single element: " + result);
    }
}


