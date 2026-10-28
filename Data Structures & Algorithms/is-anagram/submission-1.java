class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] s_word = s.toCharArray();
        char[] t_word = t.toCharArray();

        Arrays.sort(s_word);
        Arrays.sort(t_word);

        String s_string = new String(s_word);
        String t_string = new String(t_word);

        return s_string.equals(t_string);
    }
}
