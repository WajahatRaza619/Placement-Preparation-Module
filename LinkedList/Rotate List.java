class Solution {
    public ListNode rotateRight(ListNode head, int k) {
         if(k == 0 || head == null || head.next == null)
        return head;
    
    else{
        int cnt = 1;
        ListNode tail = head;
        while(tail.next != null){
            cnt++;
            tail = tail.next;
        }
    
        if(cnt < k){
            return rotateRight(head, k%cnt);
        }
    
        else if(cnt == k){
            return head;
        }
        
    
        else{
            ListNode fast = head;
            ListNode slow = head;
        
            for(int i = 0; i < k; i++){
                fast = fast.next;
            }
                
    
            while(fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }
            ListNode temp = slow.next;
            slow.next = null;
            fast.next = head;
            return temp;
        }
    }
    }
}
