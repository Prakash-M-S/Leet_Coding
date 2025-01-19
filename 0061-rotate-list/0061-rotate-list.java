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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail=head;
        if(head==null)
        {
            return head;
        }
        int len=1;

        while(tail.next!=null)
        {
            tail=tail.next;
            len++;
        }
        k=k%len;
        if(k==0)
        {
            return head;
        }
        tail.next=head;
        len=len-k;
        ListNode temp=head;
        while(len>1)
        {
            temp=temp.next;
            len--;

        }
        head=temp.next;
        temp.next=null;

        return head;
    }
}