class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<Integer>());
        
        
        for(int i : nums){
            int size = output.size();
            
            for(int j = 0; j < size; j++){
                List<Integer> temp = new ArrayList<>(output.get(j));
                temp.add(i);
                output.add(temp);
            }
        }
        return output;
        
        
        
    }
}