class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numHashMap = new HashMap<>();
        HashSet<Integer> count = new HashSet<>();

        for (int x : nums) {
            numHashMap.put(x, numHashMap.getOrDefault(x, 0) + 1);
            if (numHashMap.get(x) >= k)
                count.add(x);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(numHashMap.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        List<Integer> subLists = list.subList(0, k).stream().map(m -> m.getKey()).toList();

        System.out.println(subLists.toString());

        return subLists.stream().mapToInt(Integer::intValue).toArray();
    }
}
