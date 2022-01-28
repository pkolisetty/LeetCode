class Solution {
    public int findMaximumXOR(int[] nums) {
        
        int max = 0;
        
        ArrayList<Integer> numsList = new ArrayList<>();
        Set<Integer> map = new HashSet<>();
        
        for(int i : nums){
            if(!map.contains(i)) {
                numsList.add(i);
                map.add(i);
            }
        }
        
        
        for(int i = 0; i < numsList.size(); i++) {
            int iVal = numsList.get(i);
            for(int j = i + 1; j < numsList.size(); j++){
                int jVal = numsList.get(j);
                max = Math.max(max, iVal ^ jVal);
            }
        }
        return max;
    }
}