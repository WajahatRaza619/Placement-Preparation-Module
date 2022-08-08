class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return generate(head, null);
    }
    
    public TreeNode generate(ListNode start, ListNode end) {
        if (start == null) return null;

        ListNode midNode = mid(start, end);
        int midVal = midNode.val;
        TreeNode node = new TreeNode(midVal);

        if(!start.equals(midNode)) // without this we will end up in a StackOverflow
			node.left = generate(start, midNode);

        if (midNode.next != null && !midNode.next.equals(end)) // without this we will end up in a StackOverflow
            node.right = generate(midNode.next, end);

        return node;
    }
    
    public ListNode mid(ListNode start, ListNode end) {
        if(start == null || start.next == null) return start;
        
        ListNode slow = start;
        ListNode fast = start;
        
        while(fast != end && fast.next != end) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
