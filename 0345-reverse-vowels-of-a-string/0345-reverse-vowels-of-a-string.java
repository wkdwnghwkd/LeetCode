class Solution {
    public String reverseVowels(String s) {
        Character[] vowelArr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        Set<Character> hs = new HashSet<>(Arrays.asList(vowelArr));

        int left = 0, right = s.length()-1;

        char[] charArr = s.toCharArray();

        while(left < right) {
            while(left < right && !hs.contains(charArr[left])) left++;
            while(left < right && !hs.contains(charArr[right])) right--;

            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;

            left++;
            right--;
        }

        return new String(charArr);
    }
}