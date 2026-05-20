class Solution {
    public int[] twoSum(int[] nums, int target) {
        int diff = 0;
        HashMap<Integer, Integer> differenceHashMap = new HashMap<>();
        int[] c = new int[2];

        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            if (differenceHashMap.get(diff) != null) {
                c[0] = differenceHashMap.get(diff);
                c[1] = i;
                break;
            }
            differenceHashMap.put(nums[i], i);
        }

        return c;
    }
}
