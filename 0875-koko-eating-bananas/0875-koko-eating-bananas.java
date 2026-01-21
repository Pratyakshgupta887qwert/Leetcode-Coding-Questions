class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        // in this we need seal value of the integer : means upvalue after the round off.
        // Math.ceil   --> round off upper vala ho jata hai.

        /*

piles=[3,6,7,11]
k=2
2+3+4+6
k=11
1+1+1+1
k=7
1+1+1+2
k=5
1+2+2+3
k=4
1+2+2+3
k=3
1+2+3+4

// this sum of each (speed) all these should be less then h.
        */
        // we can use for loop also and binary search also 
        long max=0;
        for(int i:piles)max=Math.max(max,i);


// this is also okay ... but TLE is comming so we are writititg binary search.

        // for(int k=1;k<=max;k++){
        //     long hrs=hours(piles,k);
        //     if(hrs<=h) return k;
        // }

        long start=1,end=max;
        long k=max;
        while(start<=end){
            long mid=start+(end-start)/2;    // we use this for finding the average :  normal formula will give you the error.
            long hrs=hours(piles,mid);
            if(hrs>h){
                start=mid+1;   // for going rigth side : we write: (((start=mid+1)))
            }
            else{
                k=mid;
                end=mid-1;  // for going left side : we write (((end=mid-1)))
            }
        }

        return (int) k;

    }
    long hours(int piles[],long k){
        long hrs=0;
        for(int i=0;i<piles.length;i++){
            // here in this it is already interger so it will give error therefore first we will make it double so that it will not give error.


            // hrs+=Math.ceil(piles[i]/k);


// as hrs is in hrs we will make it (int) 
            hrs+=(long)Math.ceil((double)piles[i]/k);
            
        }
        return hrs;
    }
}

// this will go out of range in integer : so we need to make it long.