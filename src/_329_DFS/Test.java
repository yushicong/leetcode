package _329_DFS;

/**
 * Created by bjyushicong on 2017/7/27.
 */
public class Test {
//    nums = [
//            [9,9,4],
//            [6,6,8],
//            [2,1,1]
//            ]
//    Return 4
//    The longest increasing path is [1, 2, 6, 9].

    public static int helper(int[][] nums,int i,int j,int[][] dp){
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        int val = 0;
        if (i+1< nums.length && nums[i+1][j] > nums[i][j]){
            val = helper(nums, i + 1, j, dp);
        }
        if (i-1 >= 0 && nums[i-1][j] > nums[i][j]){
            val = helper(nums, i - 1, j, dp);
        }
        if (j+1< nums[0].length && nums[i][j+1] > nums[i][j]){
            val = helper(nums, i, j + 1, dp);
        }
        if (j-1 >= 0 && nums[i][j-1] > nums[i][j]){
            val = helper(nums, i, j - 1, dp);
        }
        val++;
        dp[i][j] = val;
        return dp[i][j];
    }


    public static int longestIncreasingPath(int[][] nums){

        int row = nums.length;
        int col = nums[0].length;
        int val = 0;
        int[][] dfp = new int[row][col];
        for (int i = 0; i<row;i++){
            for(int j = 0;j<col;j++){
                int temp = helper(nums,i,j,dfp);
                if(temp > val){
                    val = temp;
                }
            }
        }
        return val;
    }

    public static void main(String[] args) {
        int[][] nums = {{9,9,4},{6,6,8},{2,1,1}};
        int length = longestIncreasingPath(nums);
        System.out.println(length);
    }


}
