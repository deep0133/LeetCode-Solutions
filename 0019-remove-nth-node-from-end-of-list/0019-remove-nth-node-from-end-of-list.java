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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;

        int size =0;

        while(temp != null){
            size++;
            temp = temp.next;
        }

        if(size == n){
            return head.next;
        }

        n = size - n;

        temp = head;

        while(n-->1){
            temp = temp.next;
        }

        if(temp.next == null || temp.next.next == null){
            temp.next = null;
        }
        else{
            temp.next = temp.next.next;
        }
        
        return head;
    }
}