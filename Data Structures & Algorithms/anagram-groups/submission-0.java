class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagram = new ArrayList<>();
        HashMap<String, List<String>> hashAnagram = new HashMap<>();
        if (strs.length == 1) {
            anagram.add(Arrays.asList(strs));
            return anagram;
        }

        for (String v : strs) {
            char[] charv = v.toCharArray();
            Arrays.sort(charv);
            String newCharv = new String(charv);
            hashAnagram.computeIfAbsent(newCharv, k -> new ArrayList<>()).add(v);
        }
        System.out.println(hashAnagram.values().toString());
        anagram.addAll(hashAnagram.values());
        return anagram;
    }
}
