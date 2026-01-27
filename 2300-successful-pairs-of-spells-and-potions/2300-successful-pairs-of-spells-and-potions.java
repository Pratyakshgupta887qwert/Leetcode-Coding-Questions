class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int ans[]=new int[spells.length];
        int count=0;
        for(int i=0;i<spells.length;i++){
            for(int j=0;j<potions.length;j++){
                long res=1L*spells[i]*potions[j];
                if(res>=success){
                    count++;
                }
            }
            ans[i]=count;
            count=0;
        }
        return ans; 
    }
}