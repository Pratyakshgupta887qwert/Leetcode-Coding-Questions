/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */





 // Tortoise and Hare algorithm



// class Solution {
//     public ListNode middleNode(ListNode head) {
//         ListNode slow=head;
//         ListNode fast=head;
//             while(fast !=null && fast.next!=null){
//                 slow=slow.next;
//                 fast=fast.next.next;
//             }
//             return slow;
//     }
// }

class Solution {
    public ListNode middleNode(ListNode head) {
       ArrayList<ListNode> list=new ArrayList<>();
       ListNode temp=head;
       while(temp!=null){
        list.add(temp);
        temp=temp.next;
       }
       int n=list.size()/2;
       return list.get(n);
       

    }
}