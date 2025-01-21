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
    public ListNode reverseList(ListNode head) {
        ListNode temp1=null;
        ListNode temp=head;
        if(head!=null)
        {
        while(temp!=null)
        {
            ListNode t=temp.next;
            temp.next=temp1;
            temp1=temp;
temp=t;        
}
head=temp1;
        }
        return head;
    }
}