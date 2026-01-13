// class Solution {
//     public String reverseWords(String s) {
//       // sentence mein sei words  alag karna (for many functions like how many time it comes in the sentence and like this question )
//         String words[]=s.split(" ");
//         String ns="";
//         for(int i=words.length-1;i>=0;i--){
//             if(words[i].length()==0)continue;
//             ns+=words[i]+" ";
//         }
//         return ns.trim();
//     }
    
// }


// /*
// string is immutable (can not be updated but we can do this via copying this and making changes in this)

// string name = "ram";
// name = name.substring(0,1)+"b"+name.substring(2);

// */



class Solution {
    public String reverseWords(String s) {
        String words[]=s.split(" ");
        StringBuilder ns=new StringBuilder("");
        for(int i=words.length-1;i>=0;i--){
            if(words[i].length()==0)continue;
            ns.append(words[i]+" ");
        }
        return ns.toString().trim();
    }
    
}

