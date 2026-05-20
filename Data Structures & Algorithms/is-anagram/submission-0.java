class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] s_split = s.toCharArray();
        char[] t_split = t.toCharArray();
        Arrays.sort(s_split);
        Arrays.sort(t_split);

        if (Arrays.equals(s_split, t_split))
            return true;
        else
            return false;
    }
}
