class Solution {
    public boolean detectCapitalUse(String word) {
        
        if(word.length() == 1) return true;
        
        boolean cap = false;
        boolean capWord = false;
        
        if(word.charAt(0) - 'a' < 0) cap = true;
        if(cap && word.charAt(1) - 'a' < 0){
            capWord = true;
        }
        
        for(int i = 1; i < word.length(); i++) {
            if(cap){
                if(capWord && word.charAt(i) - 'a' >= 0) return false;
                else if (!capWord && word.charAt(i) - 'a' < 0) return false;
            }
            else if (!cap && word.charAt(i) - 'a' < 0) {
                return false;
            }
        }
        
        return true;
        
    }
}