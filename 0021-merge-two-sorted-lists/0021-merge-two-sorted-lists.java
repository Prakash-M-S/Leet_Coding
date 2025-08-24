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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy_h=new ListNode(-1);
        ListNode dummy=dummy_h;
        ListNode head1=list1;
        ListNode head2=list2;
        while(head1!=null&&head2!=null)
        {
            if(head1.val<head2.val)
            {
                dummy.next=new ListNode(head1.val);
                dummy=dummy.next;
                head1=head1.next;
            }
            else
            {
                dummy.next=new ListNode(head2.val);
                dummy=dummy.next;
                head2=head2.next;
            }
        }
    while(head1!=null)
    {
        dummy.next=new ListNode(head1.val);
                dummy=dummy.next;
                head1=head1.next;
    }
    while(head2!=null)
    {
        dummy.next=new ListNode(head2.val);
                dummy=dummy.next;
                head2=head2.next;
    }
        return dummy_h.next;
    }
}