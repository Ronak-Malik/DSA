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
    public int pairSum(ListNode head) {
        if(head == null || head.next == null){
            return 0;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast!=null){
            slow = slow.next ; //this is for even number linked list 
        }

        ListNode prev = null;
        ListNode curr = slow;

        while(curr!=null){
            ListNode next = curr.next ;
            curr.next = prev ;
            prev = curr;
            curr = next ;
        } 
        ListNode left = head ;
        ListNode right = prev;

        int ans = 0;//ye ans ka variable bhar banana hai isi wjha se error aara tha 

        while(right!=null){
            int sum = left.val + right.val;
            ans = Math.max(ans,sum);
            left = left.next ;
            right = right.next ;
            
        }

        return ans;
        
    }
}