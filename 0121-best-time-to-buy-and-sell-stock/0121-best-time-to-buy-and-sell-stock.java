// class Solution {
//     public int maxProfit(int[] prices) {
//         int buyPrice = prices[0];
//         int profit = 0;

//         for (int i = 1; i < prices.length; i++) {
//             if (buyPrice > prices[i]) {
//                 buyPrice = prices[i];
//             }

//             profit = Math.max(profit, prices[i] - buyPrice);
//         }

//         return profit;        
//     }
// }

// class Solution{
//     public int maxProfit(int[] prices){
//         int[] left = new int[prices.length];
//         int[] right = new int[prices.length];
//         left[0]=prices[0];
//         right[prices.length-1]= prices[prices.length-1];
//         for(int i=1;i<prices.length;i++){
//             left[i]=Math.min(left[i-1],prices[i]);
//         }
//         for(int i=prices.length-2;i>=0;i--){
//             right[i]=Math.max(right[i+1],prices[i]);
//         }
//         int max=0;
//         for(int i=0;i<prices.length;i++){
//             max=Math.max(max,right[i]-left[i]);
//         }
//         return max;
//     }

// }


// class Solution{
//     public int maxProfit(int[] prices){
//         int minPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         for(int i=0;i<prices.length;i++){
//             if(prices[i]<minPrice)
//                 minPrice = prices[i];
//             maxProfit = Math.max(prices[i]-minPrice,maxProfit);
//         }
//         return maxProfit;
//     }
// }

//cctp 
//brute force code.
// class Solution{
//     public int maxProfit(int[] prices){
//         //buy 7
//         // sell 7
//         // max=0
//         // buy = 1
//         // sell = 5 
//         // max profit =6

//         // buy = 5

//         //sell = 6
//         //max profit = 1

//         //buy = 3
//         // sell = 6
//         // max = 3

//         // so on....

//         int max=0;
//         for(int i=0;i<prices.length;i++){
//             int buy=prices[i];
//             int sell = prices[i];
//             for(int j=i+1;j<prices.length;j++){   
//                 if(prices[j]>sell){
//                     sell=prices[j];
//                     // sell =Math.max(sell,prices[j]);
//                 }
//                 //or can be written like this # removing the  if else
//                 int profit=sell-buy;
//                 max=Math.max(max,profit);
//             }
//         }
//         return max;   
//     }
// }


class Solution{
    public int maxProfit(int[] prices){
        int max=0;
        int buy=Integer.MAX_VALUE;

        // past sei smallest sei linge and sell max profit par karinge.

        //buy=7;

        //buy=1;
        // max profit : 5

        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            int sell = prices[i];
            int profit=sell-buy;
            max=Math.max(max,profit);
        }
        return max;
    }
}