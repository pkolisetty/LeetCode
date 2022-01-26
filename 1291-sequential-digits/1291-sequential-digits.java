class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer> list = new ArrayList<>();
        
        String nums = "123456789";
        
        for(int i = 0; i <= 8; i++){
            for(int j = i; j <= 8; j++){
                int curr = Integer.parseInt(nums.substring(i, j + 1));
                if(curr >= low && curr <= high){
                    list.add(curr);
                } else if(curr > high){
                    break;
                }
            }
        }
        
        Collections.sort(list);
        return list;
        
    }
}