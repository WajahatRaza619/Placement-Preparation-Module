class Solution {
    
    // two pointers
    // 1st pointer link l0 -> l1 -> l2 -> ... -> l[n/2]
    // 2nd pointer starts from L[n/2+1], reverse link L[n] -> L[n-1] -> ... -> L[n/2+1]
    // finally merge the two lists together
    public void reorderList(ListNode head) {
        // handle single node case
        if (head.next == null) return;
        // fast-slow pointers to find the mid node
        int counter = 0;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next;
            if (counter % 2 == 1) {
                slow = slow.next;
            }
            counter++;
        }
        // fast guaranteed to point to the tail
        // slow.next guaranteed not null
        // len(firstHalf) equals either len(secondHalf) when total len is even or len(secondHalf) + 1 when total len is odd
        ListNode secHalf = slow.next;
        slow.next = null;   // break the list into half
        ListNode tail = reverse(secHalf);   // reverse second half
        merge(head, tail);  // merge the two & done
    }
    
    // https://leetcode.com/problems/reverse-linked-list/
    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    
    // Similar to: https://leetcode.com/problems/merge-two-sorted-lists/
    private void merge(ListNode head, ListNode tail) {
        ListNode leftCurr = head, leftPrev = null, rightCurr = tail, rightPrev = null;
        while (rightCurr != null) {
            leftPrev = leftCurr;
            leftCurr = leftCurr.next;
            rightPrev = rightCurr;
            rightCurr = rightCurr.next;
            leftPrev.next = rightPrev;
            rightPrev.next = leftCurr;
        }
    }
}
