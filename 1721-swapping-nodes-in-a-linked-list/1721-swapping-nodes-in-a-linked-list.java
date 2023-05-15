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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode copy = head;

        int size = 0;

        while(copy != null){
            size++;
            copy = copy.next;
        }

       int a[] = new int[size];

       for(int i = 0;i<size;i++){
           a[i] = head.val;
           head = head.next;
       }

        int temp = a[k-1];
        a[k-1] = a[size - k];
        a[size - k ] = temp;

        head = null;

        for(int i = 0;i<size;i++){
            ListNode newNode = new ListNode(a[i]);
            if(head == null){
                head = newNode;
                copy = head;
            }
            else{
                copy.next = newNode;
                copy = copy.next;
            }
        }

        return head;
    }
}