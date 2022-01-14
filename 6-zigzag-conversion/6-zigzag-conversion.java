class Solution {
    public String convert(String s, int numRows) {
        
        StringBuffer[] sb = new StringBuffer[numRows];
        int length = s.length();
        
        for(int i = 0; i < numRows; i++){
            sb[i] = new StringBuffer();
        }
        
        for(int i = 0; i < length; ) {
            
            for(int down = 0; down < numRows && i < length; down++) {
                sb[down].append(s.charAt(i));
                i++;
            }
            
            for(int diag = numRows - 2; diag >= 1 && i < length; diag--) {
                sb[diag].append(s.charAt(i));
                i++;
            }
        }
        
        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i < numRows; i++){
            res.append(sb[i]);
        }
        
        return res.toString();
    }
}