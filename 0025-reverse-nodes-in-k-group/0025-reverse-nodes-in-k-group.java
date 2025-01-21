class Solution {
    public ListNode reverse(ListNode tem) {
        ListNode temp1 = null;
        ListNode temp = tem;
        while (temp != null) {
            ListNode t = temp.next;
            temp.next = temp1;
            temp1 = temp;
            temp = t;
        }
        return temp1;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        int a = k;
        if (head != null) {
            ListNode temp = head;
            ListNode curr = head;
            ListNode prev = null;
            while (true) {
                temp = curr;
                a = k;
                while (temp != null && a > 1) {
                    temp = temp.next;
                    a--;
                }
                if (temp == null) break;
                ListNode nxt = temp.next;
                temp.next = null;
                if (prev == null) {
                    head = reverse(curr);
                } else {
                    prev.next = reverse(curr);
                }
                curr.next = nxt;
                prev = curr;
                curr = nxt;
                if (curr == null) break;
            }
        }
        return head;
    }
}
