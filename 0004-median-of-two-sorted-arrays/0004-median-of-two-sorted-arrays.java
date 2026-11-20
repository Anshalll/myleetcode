import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length;
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);


        Arrays.sort(merged);


        if(merged.length % 2 != 0) {
            double ans =  (double) merged[((merged.length + 1) / 2) - 1];
            return ans;
        }
        else{
            int v1 = (Integer) merged.length / 2;
            int v2 = (Integer) (merged.length + 2) /2;
        
            double ans =  (double) ( merged[v1 -1 ] +  merged[v2 - 1]) / 2 ;
            return  ans;
        }



    }
}