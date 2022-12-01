class Solution {
    public boolean halvesAreAlike(String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        
        HashSet<Character> vowelHs = new HashSet();
        for(char vowel : vowels) vowelHs.add(vowel);
        
        int cnt = 0;
        String lowerS = s.toLowerCase();
        for(int i=0; i<s.length()/2; i++){
            if(vowelHs.contains(lowerS.charAt(i))) cnt++;
            if(vowelHs.contains(lowerS.charAt(i+s.length()/2))) cnt--;
        }
        
        return cnt == 0;
    }
}