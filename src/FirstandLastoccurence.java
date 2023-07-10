/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/



class Solution {
    public static  int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int resultf = -1;
        int resultl = -1;
        int ans[] = new int[2];
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                resultl = mid;
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        int x = 0;
        int y = n - 1;

        while (x <= y) {
            int mid = x + (y - x) / 2;

            if (nums[mid] == target) {
                resultf = mid;
                x = mid + 1;
            } else if (nums[mid] > target) {
                y = mid - 1;

            } else {
                x = mid + 1;
            }
        }

        ans[0] = resultl;
        ans[1] = resultf;
        return ans;


    }
}


public  class FirstandLastoccurence {
    public static void main(String[] args) {

        int nums[] = new int[]{2, 2, 4, 10, 10, 10, 10, 12, 23};
        int element = 10;



        Solution s=new Solution();

        int output[];



        output=s.searchRange(nums,element);
        System.out.println(output[0]+" "+output[1]);


    }
}





