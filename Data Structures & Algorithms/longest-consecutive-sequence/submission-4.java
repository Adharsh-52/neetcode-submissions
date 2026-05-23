class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        int longConsecutive = 0;
        HashSet<Integer> sortedTreeNums = new HashSet<>();
        for (int num : nums) {
            sortedTreeNums.add(num);
        }

        for (int x : sortedTreeNums) {
            if (!sortedTreeNums.contains(x - 1)) {
                int length = 1;

                while (sortedTreeNums.contains(x + length)) {
                    length++;
                }

                longConsecutive = Math.max(longConsecutive, length);
            } else {
                continue;
            }
        }

        return longConsecutive;
    }
}
