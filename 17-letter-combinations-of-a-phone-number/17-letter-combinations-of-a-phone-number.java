class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> str = new ArrayList<>();
        
        if(digits.length() == 0) {
            return str;
        }
        
        String[] chars = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        int firstDigitValue = Character.getNumericValue(digits.charAt(0));
        String firstDigitString = chars[firstDigitValue];
        
        //adding first digit
        for(int i = 0; i < firstDigitString.length(); i++){
            str.add(Character.toString(firstDigitString.charAt(i)));
        }
        
        for(int i = 1; i < digits.length(); i++){
            int size = str.size();
            int digit = Character.getNumericValue(digits.charAt(i));
            String digitString = chars[digit];
            
            for(int j = 0; j < size; j++){
                String current = str.get(j);
                
                for(int k = 0; k < digitString.length(); k++){
                    str.add(current + Character.toString(digitString.charAt(k)));
                } 
            }
            
            for(int j = 0; j < size; j++){
                str.remove(0);
            }
        }
        return str;
    }
}