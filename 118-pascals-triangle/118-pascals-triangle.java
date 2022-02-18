class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 1; i <= numRows; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            
            for(int j = 0; j < i; j++){
                if(j == 0 || j == i-1) {
                    temp.add(1);
                } else{
                    temp.add(list.get(i-2).get(j) + list.get(i-2).get(j-1));
                }
            }
            list.add(temp);
        }
        
        return list;
    }
}