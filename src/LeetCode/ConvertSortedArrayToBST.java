package LeetCode;

public class ConvertSortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums){
        if(nums.length == 0 || nums == null){
            return null;
        }
        return constructBSTrecursively(nums, 0, nums.length-1);
    }
    private TreeNode constructBSTrecursively(int[] nums, int low , int high){
        if(low > high){
            return null;
        }
        int mid = low + (high - low) / 2;
        TreeNode current = new TreeNode(nums[mid]);
        current.left = constructBSTrecursively(nums, low, mid - 1);
        current.right = constructBSTrecursively(nums, mid+1, high);
        return current;
    }

}
