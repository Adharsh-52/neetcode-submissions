class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> checkDup = new HashSet<>();

        for (int x : nums)
            checkDup.add(x);

        return checkDup.size() < nums.length ? true : false;        
    }
}