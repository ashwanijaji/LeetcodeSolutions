// Runtime: 85 ms
//Memory: 42.7MB
class Solution {
    public int[] twoSum(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
        
        for(int j=i+1;j<arr.length;j++){
            if(arr[i] + arr[j] == target )
                 return new int[]{i,j};
            
        }
        }
        return new int[]{0};
    }
}