class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer x:nums){
            if(map.containsKey(x)){
                return true;
            }else{
                map.put(x,1);
            }
        }
        return false;
        
    }
}