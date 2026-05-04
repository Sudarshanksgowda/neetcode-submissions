class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] arr=new int [2];
        int i=0;
        HashMap<Integer ,Integer> map=new HashMap<>();
        for(Integer x:nums){
            if(map.containsKey(target-x)){
              arr[0]=map.get(target-x);
              arr[1]=i;
            }else{
                map.put(x,i);
                i++;
            }
        }
     return arr;
    }
}
