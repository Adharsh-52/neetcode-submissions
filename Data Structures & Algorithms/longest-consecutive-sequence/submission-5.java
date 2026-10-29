class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;

        for(int x: nums) set.add(x);

        for(int y: set) {
            if(!set.contains(y - 1)) {
                int current = y;
                int length = 1;

                while(set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
