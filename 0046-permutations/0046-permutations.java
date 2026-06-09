class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // combination and selection , order does not matters 
        // purmulation (order matter karaga)
        // combination (order matter nahi karta)
        // arrangement : premutation 
        // selection : combination

    // constraints : kaam hai iss ka matlb recursion without dp
    // if constraints are big and recursion is their so with dp it will solve.

        List<Integer> number = new ArrayList<>();
        for(int i:nums) number.add(i);
        List<List<Integer>> ans=new ArrayList<>();
        fun(number,ans,new ArrayList<>());
        return ans;
    }
    void fun(List<Integer> nums,List<List<Integer>> ans,List<Integer> p){
        if(nums.size()==0){
            ans.add(new ArrayList<>(p));
            return;
        }
        for(int i=0;i<nums.size();i++){
            int num=nums.get(i);
            p.add(num);
            nums.remove(i);
            fun(nums,ans,p);
            p.remove(p.size()-1);
        // index ke sath number add kiya.
            nums.add(i,num);

        }
    }
}