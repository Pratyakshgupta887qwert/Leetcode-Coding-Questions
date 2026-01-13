class Solution {
    public String reverseWords(String s) {
      // sentence mein sei words  alag karna (for many functions like how many time it comes in the sentence and like this question )
        String words[]=s.split(" ");
        String ns="";
        for(int i=words.length-1;i>=0;i--){
            if(words[i].length()==0)continue;
            ns+=words[i]+" ";
        }
        return ns.trim();
    }
    
}