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



// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode curr = head;
//         ListNode tmp = null;
//         while(curr !=null){
//             tmp =curr.next;
//             curr.next =prev;
//             prev =curr;
//             curr = tmp;
//         }
//         return prev;
//     }
// }


// class Solution {
//     public ListNode reverseList(ListNode head) {
//         List<Integer> l = new ArrayList<>();
//         ListNode tmp = head;
//         while (tmp != null) {
//             l.add(tmp.val);
//             tmp = tmp.next;
//         }

//         int in = l.size() - 1;
//         tmp = head;
//         while (tmp != null) {
//             tmp.val = l.get(in);
//             tmp = tmp.next;
//             in--;
//         }

//         return head; 
//     }
// }


class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null, curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}