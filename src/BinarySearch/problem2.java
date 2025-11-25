package BinarySearch;

/// 33. Search in Rotated Sorted Array
/*
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
*
* */

public class problem2 {
    public static int Search(int arr[], int target){
        int left = 0;
        int right = arr.length-1;

        while(left <= right){

            int mid = (left + right) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[left] <= arr[mid]){
                //search in left sorted part
                if(arr[left] <= target && target <= arr[mid]){
                    right = mid;
                }else{
                    left = mid + 1;
                }
            }else{
                if(arr[mid] <= target && target <= arr[right]){
                    left = mid;
                }else{
                    right = mid -1;
                }
            }

        }

        return -1;
    }
    public static void main(String args[]){
            int nums[] = {4,5,6,7,0,1,2};
            int target = 0;
            int ans = Search(nums,target);
            System.out.println(ans);
    }
}
