class Solution {
    public boolean halvesAreAlike(String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        
        String a = s.toLowerCase().substring(0,s.length()/2);
        String b = s.toLowerCase().substring(s.length()/2);
        
        int aVowelCnt = 0;
        int bVowelCnt = 0; 
        for(char ch : a.toCharArray()){
            if(Arrays.binarySearch(vowels, ch) > -1){
                aVowelCnt++;
            }
        }
        
        for(char ch : b.toCharArray()){
            if(Arrays.binarySearch(vowels, ch) > -1){
                bVowelCnt++;
            }
        }
        
        return aVowelCnt == bVowelCnt;
    }
}