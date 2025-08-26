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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return false;
        
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }   
        ListNode prev=null;
        while(slow!=null)
        {
            ListNode tmp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=tmp;
        }
        ListNode l=head;
        ListNode r=prev;
        while(r!=null)
        {
            if(l.val!=r.val)
            {
                return false;
            }
            l=l.next;
            r=r.next;
        }
        return true;

        }
    
}