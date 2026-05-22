class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prodNums = new int[nums.length];
        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j == i)
                    continue;

                if (nums[j] == 0) {
                    product = 0;
                    break;
                }

                product *= nums[j];
            }
            prodNums[i] = product;
            product = 1;
        };

        return prodNums;
    }
}
