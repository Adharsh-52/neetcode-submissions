class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> newNums = new HashMap<>();

        for (int i : nums) {
            newNums.put(i, newNums.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap =
            new PriorityQueue<>((a, b) -> Integer.compare(a.getValue(), b.getValue()));

        for (Map.Entry<Integer, Integer> e : newNums.entrySet()) {
            heap.offer(e);
            if (heap.size() > k)
                heap.poll();
        }

        int[] result = new int[k];

        for (int i = 0; i < result.length; i++) {
            result[i] = heap.poll().getKey();
        }

        return result;
    }
}
