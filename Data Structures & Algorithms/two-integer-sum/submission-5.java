class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> setCount = new HashMap<>();
        int diff;

        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            if (setCount.containsKey(diff)) {
                return new int[] {setCount.get(diff), i};
            }
            setCount.put(nums[i], i);
        }

        return new int[] {};
    }
}
