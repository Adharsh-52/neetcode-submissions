class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] idx = new int[2];
        while (i < j) {
            if ((numbers[i] + numbers[j]) > target) {
                j--;
                continue;
            } else if ((numbers[i] + numbers[j]) < target) {
                i++;
                continue;
            } else {
                break;
            }
        }
        idx[0] = i + 1;
        idx[1] = j + 1;
        return idx;
    }
}
