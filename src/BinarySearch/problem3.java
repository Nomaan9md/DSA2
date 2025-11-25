package BinarySearch;
/// KOKO eating banana
/*
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas.
The guards have gone and will come back in h hours. Koko can decide her bananas-per-hour eating speed of k.
Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas,
she eats all of them instead and will not eat any more bananas during this hour.Koko likes to eat slowly but still wants to finish eating
all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

Example 1:
Input: piles = [3,6,7,11], h = 8
Output: 4

Example 2:
Input: piles = [30,11,23,4,20], h = 5
Output: 30

* */

public class problem3 {
    public static boolean canEatInTime(int[] piles, int k, int h){
        long hr = 0;
        for(int pile : piles){
            int div  = pile / k;
            hr += div;
            if(pile % k != 0) hr++;
        }
        return hr <= h;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = piles[0];
        for(int i=0; i<piles.length; i++){
            right = Math.max(right, piles[i]);
        }


        while(left <= right){
            int mid = (left + right) / 2;
            if(canEatInTime(piles, mid, h)) right = mid - 1;
            else left = mid + 1;

        }
        return left;
    }

    public static void main(String args[]){
        int arr[] = {3,6,7,11};
        int h = 8;
        int ans = minEatingSpeed(arr,h);
        System.out.println(ans);
    }

}
