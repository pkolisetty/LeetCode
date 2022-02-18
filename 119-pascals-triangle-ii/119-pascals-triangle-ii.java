class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 1; i <= rowIndex+1; i++) {
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
        
        return list.get(rowIndex);
    }
}