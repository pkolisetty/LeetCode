class Solution {
    public boolean validMountainArray(int[] arr) {
        
        if(arr.length < 3) return false;
        int i = 1;
        
        while(i < arr.length - 1) {
            
            //if current element is less than and we have not reached the peak yet
            if(arr[i-1] >= arr[i] && i == 1) {
                return false;
            } else if(arr[i-1] >= arr[i]) {
                break;
            }
            i++;
        }

        while(i < arr.length) {
            if(arr[i-1] <= arr[i]) {
                return false;
            }
            i++;
        }
        return true;
        
    }
}