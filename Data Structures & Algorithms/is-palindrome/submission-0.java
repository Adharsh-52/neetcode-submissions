class Solution {
    public boolean isPalindrome(String s) {
        String[] content = s.split("[^a-zA-Z0-9]");
        String content_2 = String.join("", content);
        String reverse = new StringBuilder(content_2).reverse().toString();
        return reverse.equalsIgnoreCase(content_2);
    }
}
