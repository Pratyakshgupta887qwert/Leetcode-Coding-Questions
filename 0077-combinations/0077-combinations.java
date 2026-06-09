// recursion + backtracing

// class Solution {
//     public List<List<Integer>> combine(int n, int k) {
//         List<Integer> nums=new ArrayList<>();
//         for(int i=1;i<=n;i++) nums.add(i);
//         List<List<Integer>> ans=new ArrayList<>();
//         fun(nums,ans,k,new ArrayList<> (),0);
//         return ans;

//     }
//     void fun(List<Integer>nums,List<List<Integer>> ans,int k,List<Integer>c,int idx){
//         if(c.size()==k){
//             ans.add(new ArrayList<>(c));
//             return;
//         }
//         for(int i=idx;i<nums.size();i++){
//             int num=nums.get(i);
//             c.add(num);
//             fun(nums,ans,k,c,i+1);
//             c.remove(c.size()-1);
//         }
//     }
// }



class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> nums=new ArrayList<>();
        for(int i=1;i<=n;i++) nums.add(i);
        List<List<Integer>> ans=new ArrayList<>();
        fun(nums,ans,k,new ArrayList<> (),0);
        return ans;

    }
    void fun(List<Integer>nums,List<List<Integer>> ans,int k,List<Integer>c,int idx){
        if(c.size()==k){
            ans.add(new ArrayList<>(c));
            return;
        }
        if(idx>=nums.size())return;
        //exclude
        fun(nums,ans,k,c,idx+1);

        //include
        c.add(nums.get(idx));
        fun(nums,ans,k,c,idx+1);
        c.remove(c.size()-1);

    }
}